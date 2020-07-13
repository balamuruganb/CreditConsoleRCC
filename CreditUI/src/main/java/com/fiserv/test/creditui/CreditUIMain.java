package com.fiserv.test.creditui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fiserv.test.creditmanager.CreditManagerConstants;

public class CreditUIMain {

	
	static final Logger LOGGER = LogManager.getLogger(CreditUIMain.class);
	
	public static void main(String args[]) {

		LOGGER.info("Hello World {} ", CreditManagerConstants.CREDIT_MANAGER);
	}
}
