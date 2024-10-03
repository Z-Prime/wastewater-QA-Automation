package com.qe.vt.zprime.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {
	public static String getDateandTime() {
	  	return new SimpleDateFormat ("dd-mmm-yy-hh-mm-ss-sss").format(new Date());	
	  }
	}