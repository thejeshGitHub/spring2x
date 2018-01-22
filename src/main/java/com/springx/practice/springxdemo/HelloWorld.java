package com.springx.practice.springxdemo;

import java.util.logging.Logger;

public class HelloWorld {
	private  Logger logger = Logger.getLogger("HelloWorld");
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	public void printName() {		
		logger.info(name);
	}
}
