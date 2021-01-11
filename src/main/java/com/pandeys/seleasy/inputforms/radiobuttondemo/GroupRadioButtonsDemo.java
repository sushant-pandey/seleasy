package com.pandeys.seleasy.inputforms.radiobuttondemo;

public interface GroupRadioButtonsDemo {

	String getBlockHeader();
	
	String getInstructionText();
	
	GroupRadioButtonsDemo selectMaleOption();
	
	GroupRadioButtonsDemo selectFemaleOption();
	
	GroupRadioButtonsDemo select0_5AgeGroupOption();
	
	GroupRadioButtonsDemo select5_15AgeGroupOption();
	
	GroupRadioButtonsDemo select15_50AgeGroupOption();
	
	GroupRadioButtonsDemo clickGetValues();
	
	String getDisplayedSexResult();
	
	String getDisplayedAgeResult();
}
