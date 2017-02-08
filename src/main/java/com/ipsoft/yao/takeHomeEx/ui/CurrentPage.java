package com.ipsoft.yao.takeHomeEx.ui;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class CurrentPage extends PageObject{

	public boolean containsWelcomeMessage(String string) {
	
		return this.find(By.cssSelector("*[title='Wikipedia']")).containsText(string);
	}

}
