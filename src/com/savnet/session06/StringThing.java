package com.savnet.session06;

public class StringThing {
	public static void main(String[] args) {
		String s = "abc";
		String s2 = "def";
		String s3 = "abc";
		String s4 = new String("abc");

		System.out.println(s == s2);
		System.out.println(s == s3);
		System.out.println(s == s4);

		System.out.println(s.equals(s4));

		System.out.println(s.equals("abc"));
		System.out.println("abc".equals(s));

		s = s + "d";
		System.out.println(s);
		// String-urile sunt imutabile

		System.out.println("abcde".charAt(2));
		System.out.println("abcde".equals("Abcde"));
		System.out.println("abcde".equalsIgnoreCase("Abcde"));

		System.out.println("abc".compareTo("abc"));
		System.out.println("abc".compareTo("abd"));
		System.out.println("abd".compareTo("abc"));

		System.out.println("abc".compareToIgnoreCase("Abc"));
		System.out.println("abc".compareToIgnoreCase("Abd"));
		System.out.println("abd".compareToIgnoreCase("Abc"));

		System.out.println("abc".contains("bc"));
		System.out.println("abc".contains("ac"));
		System.out.println("abc".endsWith("bc"));

		System.out.println("abc".indexOf('a'));
		System.out.println("abca".indexOf('a'));
		System.out.println("abca".lastIndexOf('a'));
		System.out.println("abca".indexOf('d'));

		System.out.println("abc".indexOf("ab"));
		System.out.println("abca".indexOf("ab"));
		System.out.println("abca".lastIndexOf("ca"));
		System.out.println("abca".indexOf("d"));

		System.out.println("abc".isEmpty());

		System.out.println("abc".length());

		System.out.println("abc".replace('a', 'A'));
		s = "abc";
		s.replace('a', 'd');
		System.out.println(s);

		System.out.println("abc".replaceAll("ab", "AB"));
		System.out.println("abc".startsWith("ab"));

		System.out.println("abcde".substring(2));
		System.out.println("abcde".substring(1, 3));

		char[] array = "abc".toCharArray();
		for (char ch : array) {
			System.out.println(ch);
		}

		String[] splits = "123, 234, 345, 456".split(",");
		for (String ss : splits) {
			System.out.println(ss.trim());
		}

		System.out.println("abc".toUpperCase());
		System.out.println("ABC".toLowerCase());

		System.out.println(String.format("Primul numar este %d si al doilea este %d", 7, 3));
	}
}
