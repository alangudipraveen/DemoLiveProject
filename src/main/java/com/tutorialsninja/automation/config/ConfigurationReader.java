package com.tutorialsninja.automation.config;

public interface ConfigurationReader {
	
	public String getUrl();
	public String getBrowser();
	public int getPageLoadTimeOut();
	public String getEmail();
	public String getPassword();
	public String getProduct();
	public String getMessage();

}
