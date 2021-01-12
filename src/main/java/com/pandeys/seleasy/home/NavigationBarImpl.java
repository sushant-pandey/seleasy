package com.pandeys.seleasy.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pandeys.seleasy.alertsandmodal.AlertsAndModal;
import com.pandeys.seleasy.datapickers.DatePicker;
import com.pandeys.seleasy.datapickers.BootStrapDatePickerImpl;
import com.pandeys.seleasy.home.table.Table;
import com.pandeys.seleasy.inputforms.InputForm;
import com.pandeys.seleasy.listbox.ListBox;
import com.pandeys.seleasy.other.Others;
import com.pandeys.seleasy.progressbar.ProgressBar;

public class NavigationBarImpl implements NavigationBar {

	private WebDriver driver;
	
	private By inputFormsLoc = By.xpath("//div[@class='collapse navbar-collapse']/descendant::a[contains(text(), 'Input Forms')]");
	private By datePickerLoc = By.xpath("//div[@class='collapse navbar-collapse']/descendant::a[contains(text(), 'Date pickers')]");
	
	public NavigationBarImpl(WebDriver driver) {
		this.driver = driver;
	}

	@Override
	public InputForm getInputForms() {
		driver.findElement(inputFormsLoc).click();
		return new InputForm(driver);
	}

	@Override
	public DatePicker getDatePicker() {
		driver.findElement(datePickerLoc).click();
		return new DatePickerImpl(driver) ;
	}

	@Override
	public Table getTable() {
		return null;
	}

	@Override
	public ProgressBar getProgressBar() {
		return null;
	}

	@Override
	public AlertsAndModal getAlertsAndModal() {
		return null;
	}

	@Override
	public ListBox getListBox() {
		return null;
	}

	@Override
	public Others getOthers() {
		return null;
	}

}
