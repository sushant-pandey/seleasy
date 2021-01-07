package com.pandeys.seleasy.home.slides;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

public class SlidersImpl implements Sliders {
	private WebDriver driver;
	
	private List<Slider> listOfSliders;
	
	public SlidersImpl(WebDriver driver) {
		this.driver = driver;
	}
	
	@Override
	public Map<String, Slider> getSliders() {		
		Map<String, Slider> sliderMap = new HashMap<String, Slider>();
		sliderMap.put("SeleniumExpertSlide", new SeleniumExpertSlide(driver));
		sliderMap.put("BootstrapSlide", new BootstrapSlide(driver));
		sliderMap.put("JQuerySlide", new JQuerySlide(driver));
		sliderMap.put("SeleniumExampleSlide", new SeleniumExampleSlide(driver));
		return sliderMap;
	}

}
