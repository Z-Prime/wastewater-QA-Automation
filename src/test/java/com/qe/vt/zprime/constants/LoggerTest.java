package com.qe.vt.zprime.constants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerTest {
	private static final Logger logger = LogManager.getLogger(LoggerTest.class);

	public static void main(String[] args) {
		System.out.println("==========Start========");
		logger.atFatal().log("==== FATAL.............");
		logger.atError().log("==== ERROR.............");
		logger.atWarn().log("==== WARN LOG.............");
		logger.atInfo().log("==== INFO.............");
		logger.atDebug().log("==== DEBUG.............");
		logger.atTrace().log("======TRACE======");
		System.out.println("============Ends========");
	}
}
