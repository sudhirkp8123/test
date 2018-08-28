package com.java.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConvertor {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			String strDate = sdf.format(new Date());
			System.out.println(strDate);
			Date date = sdf.parse("2009-12-31");
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
