package com.learning.mergemeetingranges;

import java.util.Comparator;

public class SortByStartTime implements Comparator<MeetingRange> {

	@Override
	public int compare(MeetingRange o1, MeetingRange o2) {
		return o1.getStartTime()-o2.getStartTime();
	}

}
