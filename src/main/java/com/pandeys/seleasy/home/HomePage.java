package com.pandeys.seleasy.home;

import com.pandeys.seleasy.home.slides.Sliders;

public interface HomePage {
	Sliders getSliders();
	
	MenuList getMenuList();
	
	Tabs getTabGroup();
}
