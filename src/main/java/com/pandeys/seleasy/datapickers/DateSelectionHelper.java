package com.pandeys.seleasy.datapickers;

import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DateSelectionHelper {
	private WebDriver driver;
	public DateSelectionHelper(WebDriver driver) {
		this.driver = driver;
	}
	
	public DateSelectionHelper selectMonth() {
		By displayedMonth = By.className("datepicker-switch");
		LocalDate currentdate = LocalDate.now();
		int currentYear = currentdate.getYear();
		System.out.println("Current Year " + currentYear);
		String displayedMonthYear = driver.findElement(displayedMonth).getText();
		System.out.println();
		int displayedCurrentYear = Integer.parseInt(displayedMonthYear.split(" ")[1].trim());
		String displayedCurrentMonth = displayedMonthYear.split(" ")[0];
		System.out.println("Displayed Current Month Year " + displayedCurrentMonth + ":::" + displayedCurrentYear);
		
		
		
		return this;
	}

	private DateSelectionHelper selectCurrentYear(String expectedMonthYear) {
		By prevLoc = By.className("prev");
		driver.findElement(prevLoc).click();
		
		return this;
	}
	
	private int getMonthIntValue(String month) {
		switch (month) {
		case "January":
			return 1;
		case "February":
			return 2;
		case "March":
			return 3;
		case "April":
			return 4;
		case "May":
			return 5;
		case "June":
			return 6;
		case "July":
			return 7;
		case "August":
			return 8;
		case "September":
			return 9;
		case "October":
			return 10;
		case "November":
			return 11;
		case "December":
			return 12;
		}
		return 0;
	}
}
