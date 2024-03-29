package com.itranswarp.learnjava;

import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;

/**
 *使用JDK Logging
 */
public class Main {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Main.class.getName());
		logger.info("Start process...");
		try {
			"".getBytes("invalidCharsetName");
		} catch (UnsupportedEncodingException e) {
			// TODO: 使用logger.severe()打印异常
//			e.printStackTrace();
			logger.severe(e.toString());
		}

		logger.info("Process end.");
	}
}
