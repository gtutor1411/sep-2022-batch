package com.browser.allen;
import com.busyqa.browser.DeepBrowser;

public class Allbrowser extends DeepBrowser {
	
	
	public Allbrowser (String profile) {
		
		System.out.println(profile + " Created");
	}
	
	/*
	public void myCustomFeature (String profile) {
		
		super.clickOnButton();
	}
	*/
	
	public void myCustomFeature2 (String profile) {
		
		super.goToAnyAddres("www.twitter.com");
	}
	
	

}
