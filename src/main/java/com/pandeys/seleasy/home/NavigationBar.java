package com.pandeys.seleasy.home;

import com.pandeys.seleasy.alertsandmodal.AlertsAndModal;
import com.pandeys.seleasy.datapickers.DatePicker;
import com.pandeys.seleasy.home.table.Table;
import com.pandeys.seleasy.inputforms.InputForm;
import com.pandeys.seleasy.listbox.ListBox;
import com.pandeys.seleasy.other.Others;
import com.pandeys.seleasy.progressbar.ProgressBar;

public interface NavigationBar {
	InputForm getInputForms();
	
	DatePicker getDatePicker();
	
	Table getTable();
	
	ProgressBar getProgressBar();
	
	AlertsAndModal getAlertsAndModal();
	
	ListBox getListBox();
	
	Others getOthers();
}
