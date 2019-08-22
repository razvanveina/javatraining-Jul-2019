package com.savnet.session06;

public class StringUtils {
	public static void main(String[] args) {
		String result = capitalize("popescu ion");
		capitalize("gheorghe hagi");
		// return Popescu Ion
		System.out.println(result);
	}

	private static String capitalize(String s) {
		String[] arr = s.split(" ");
		String result = "";
		for (String ss : arr) {
			String temp = ss.substring(0, 1).toUpperCase() + ss.substring(1).toLowerCase();
			// System.out.println(temp);
			result += temp + " ";
		}
		return result;
	}
}
