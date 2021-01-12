package com.pandeys.seleasy.datapickers;

public interface DateExample {
	String getBlockHeader();
	
	String getInstructionText();
	
	String getLabel();
	
	DateExample selectDate(String date);
	
	String getSelectedDate();
}
