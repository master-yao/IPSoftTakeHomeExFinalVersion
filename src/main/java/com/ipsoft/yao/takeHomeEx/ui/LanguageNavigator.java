package com.ipsoft.yao.takeHomeEx.ui;

import net.serenitybdd.core.pages.PageObject;


public class LanguageNavigator extends PageObject{

	public void selectEnglish() {
		$("#js-link-box-en").click();
		//this.find(By.cssSelector("a[id=js-link-box-en]")).click();	
	}
	
}
