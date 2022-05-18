package com.learning.mergemeetingranges;

public class MeetingRange {
	
	private int startTime;
	private int endTime;
	
	
	public MeetingRange(int startTime, int endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}


	public int getStartTime() {
		return startTime;
	}


	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}


	public int getEndTime() {
		return endTime;
	}


	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}


	@Override
	public String toString() {
		return "MeetingRange [startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	

}
