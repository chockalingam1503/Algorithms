package com.learning.mergemeetingranges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MergeMeetingNewLogic {

	public static List<MeetingRange> mergeMeetings(List<MeetingRange> meetingList) {

		List<MeetingRange> workingList = new ArrayList<MeetingRange>(meetingList);
		List<MeetingRange> mergedList = new ArrayList<MeetingRange>();

//		Collections.sort(workingList, new Comparator<MeetingRange>() {
//
//			@Override
//			public int compare(MeetingRange o1, MeetingRange o2) {
//				return o1.getStartTime() - o2.getStartTime();
//			}
//		});
//		
		// with java8

		workingList = workingList.stream().sorted((o1, o2) -> o1.getStartTime() - o2.getStartTime())
				.collect(Collectors.toList());

		mergedList.add(workingList.get(0));

		int count = 0;
		for (MeetingRange currentMeeting : workingList) {

			int previousEndTime = mergedList.get(mergedList.size() - 1).getEndTime();

			if (currentMeeting.getStartTime() <= previousEndTime && currentMeeting.getEndTime() > previousEndTime) {
				mergedList.get(mergedList.size() - 1).setEndTime(currentMeeting.getEndTime());
			} else if (currentMeeting.getStartTime() > previousEndTime) {
				if (count != 0) {
					mergedList.add(currentMeeting);
				}

			}

			count++;
		}

		return mergedList;
	}

	public static void main(String[] args) {
		List<MeetingRange> meetingList = new ArrayList<>();
		meetingList.add(new MeetingRange(0, 2));
		meetingList.add(new MeetingRange(1, 2));
		meetingList.add(new MeetingRange(2, 4));
		meetingList.add(new MeetingRange(5, 6));
		meetingList.add(new MeetingRange(12, 14));
		meetingList.add(new MeetingRange(13, 19));
		meetingList.add(new MeetingRange(19, 20));
		meetingList.add(new MeetingRange(21, 22));
		meetingList.add(new MeetingRange(21, 24));
		mergeMeetings(meetingList).forEach(System.out::println);
	}

}
