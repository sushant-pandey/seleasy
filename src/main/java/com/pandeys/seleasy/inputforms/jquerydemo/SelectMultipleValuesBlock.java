package com.pandeys.seleasy.inputforms.jquerydemo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface SelectMultipleValuesBlock {

	SelectMultipleValuesBlock selectState(String... states);

	String getSelectedState();

}
