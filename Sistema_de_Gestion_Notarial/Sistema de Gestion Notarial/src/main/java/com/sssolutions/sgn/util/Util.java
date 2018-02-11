package com.sssolutions.sgn.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	public static String dateConvert(String date) {
		
		if (date.equals("")){
			
			return "";
			
		}
		
		SimpleDateFormat input = new SimpleDateFormat("yyyy-MM-dd");
		Date dateValue = new Date();
		
		try {
			dateValue = input.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		return (formatter.format(dateValue));
 	
	}
	

	
}
