package com.busyqa.browser;

import com.browser.allen.Allbrowser;
import com.busyqa.sessions.Session2;

public class Realworld {

	public static void main(String[] args) {

		PalakBrowser palBrowser = new PalakBrowser();
		palBrowser.openBrowser();
		palBrowser.maximizeBrowser();
		palBrowser.gotToGoogle();
		palBrowser.clickOnButton();
		palBrowser.minimizeBrowser();
		palBrowser.closeBrowser();
		PalakBrowser.changeColorOfBrowser();

		HetviBrowser hetBrowser = new HetviBrowser();
		hetBrowser.openBrowser();
		hetBrowser.maximizeBrowser();
		hetBrowser.gotToGoogle();
		hetBrowser.clickOnButton();
		hetBrowser.minimizeBrowser();
		hetBrowser.typeInTextBoxes();
		hetBrowser.closeBrowser();

		DeepBrowser deepBrowser = new DeepBrowser();
		deepBrowser.openBrowser();
		deepBrowser.maximizeBrowser();
		deepBrowser.goToAnyAddres("www.facebook.com");
		deepBrowser.clickOnButton();
		deepBrowser.minimizeBrowser();
		deepBrowser.typeInTextBoxes();
		deepBrowser.closeBrowser();

		Allbrowser allbrowser = new Allbrowser("Girish");
		allbrowser.openBrowser();
		allbrowser.maximizeBrowser();
		allbrowser.goToAnyAddres("www.facebook.com");
		allbrowser.clickOnButton();
		allbrowser.minimizeBrowser();
		allbrowser.typeInTextBoxes();
		allbrowser.closeBrowser();

		IBrowser browser = new UltimateBrowser();
		browser.openBrowser();
		browser.closeBrowser();
		browser = new PowerBrowser();

		browser.openBrowser();
		browser.closeBrowser();

		/*
		 * SessionThree s3 = new SessionThree(); s3.execute(2, 5);
		 * System.out.println(s3.a); System.out.println(s3.b);
		 */
	}

}
