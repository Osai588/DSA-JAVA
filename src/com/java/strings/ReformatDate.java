package com.java.strings;

import java.util.HashMap;
import java.util.Map;

public class ReformatDate {

	public static void main(String[] args) {

		String date = "20th Oct 2052";

		Map<String, String> map = new HashMap<String, String>();
		map.put("Jan", "01");
		map.put("Feb", "02");
		map.put("Mar", "03");
		map.put("Apr", "04");
		map.put("May", "05");
		map.put("Jun", "06");
		map.put("Jul", "07");
		map.put("Aug", "08");
		map.put("Sep", "09");
		map.put("Oct", "10");
		map.put("Nov", "11");
		map.put("Dec", "12");

		String[] arr = date.split(" ");

		String day = arr[0];
		String month = arr[1];
		String year = arr[2];

		day = day.substring(0, day.length() - 2);
		int dayNumber = Integer.parseInt(day);

		System.out.println(year + "-" + map.get(month) + "-" + String.format("%02d", dayNumber));

	}

}
