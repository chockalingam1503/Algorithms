package com.learning.mergemeetingranges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeMeetingRange {

	public static void main(String[] args) {

		List<MeetingRange> meetingList = new ArrayList<>();
		meetingList.add(new MeetingRange(0, 2));
		meetingList.add(new MeetingRange(3, 4));
		meetingList.add(new MeetingRange(4, 6));
		meetingList.add(new MeetingRange(12, 14));

		meetingList.add(new MeetingRange(13, 19));
		meetingList.add(new MeetingRange(19, 20));
		meetingList.add(new MeetingRange(21, 22));
		meetingList.add(new MeetingRange(21, 24));

		Collections.sort(meetingList, new SortByStartTime());

		meetingList.stream().forEach(meeting -> System.out.println(meeting));

		int startTime = 0;
		int endTime = 0;
		int i = 0;
		List<MeetingRange> meetingList1 = new ArrayList<>();
		boolean resetNeeded = true;
		for (MeetingRange meeting : meetingList) {

			if (resetNeeded) {
				startTime = meeting.getStartTime();
				endTime = meeting.getEndTime();
				resetNeeded = false;
				;
			}

			if (endTime >= meeting.getStartTime()) {
				if (endTime < meeting.getEndTime()) {
					endTime = meeting.getEndTime();
				}
				resetNeeded = false;
				;
			} else {
				meetingList1.add(new MeetingRange(startTime, endTime));

				resetNeeded = true;
			}

			if (i == meetingList.size() - 1) {
				if (resetNeeded) {
					
					

					meetingList1.add(new MeetingRange(meeting.getStartTime(), meeting.getEndTime()));
					resetNeeded = false;
					;
				} else {
					meetingList1.add(new MeetingRange(startTime, meeting.getEndTime()));
				}
			}

			i++;

			if (resetNeeded) {
				startTime = meeting.getStartTime();
				endTime = meeting.getEndTime();
				resetNeeded = false;
				;
			}
		}

		System.out.println("~~~~~");
		meetingList1.stream().forEach(meeting -> System.out.println(meeting));

	}

}
