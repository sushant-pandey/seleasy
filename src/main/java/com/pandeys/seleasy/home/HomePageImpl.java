package com.pandeys.seleasy.home;

import org.openqa.selenium.WebDriver;

import com.pandeys.seleasy.home.slides.Sliders;
import com.pandeys.seleasy.home.slides.SlidersImpl;

public class HomePageImpl implements HomePage {

	private WebDriver driver;
	
	public HomePageImpl(WebDriver driver) {
		this.driver = driver;
	}
	
	@Override
	public Sliders getSliders() {
		return new SlidersImpl(driver);
	}

	@Override
	public MenuList getMenuList() {
		return null;
	}

	@Override
	public Tabs getTabGroup() {
		return null;
	}

	@Override
	public NavigationBar getNavigationBar() {
		return new NavigationBarImpl(driver);
	}

}
