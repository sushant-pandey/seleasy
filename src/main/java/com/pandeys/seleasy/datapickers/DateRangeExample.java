package com.pandeys.seleasy.datapickers;

public interface DateRangeExample {
	String getBlockHeader();
	
	String getInstructionText();
	
	String getLabelForDateRange();
	
	DateRangeExample selectStartDate(String startDate);
	
	DateRangeExample selectEndDate(String endDate);
	
	String getStartDate();
	
	String getEndDate();
}
