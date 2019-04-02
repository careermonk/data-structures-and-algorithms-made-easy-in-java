package chapter21miscconcepts;
import java.util.regex.*;

class RegexDemo{
	public static void main (String[] args) throws java.lang.Exception{
		//matches numbers only
		String regexStr = "^[0-9]*$";
		System.out.println(Pattern.matches(regexStr,"97845613000"));
		System.out.println(Pattern.matches(regexStr,"19432"));
		System.out.println(Pattern.matches(regexStr,"519Ah"));

		//matches 10-digit numbers only
		regexStr = "^[0-9]{10}$";
		System.out.println(Pattern.matches(regexStr,"6576767"));
		System.out.println(Pattern.matches(regexStr,"9784561300"));
		System.out.println(Pattern.matches(regexStr,"F784561300"));

		//matches numbers and dashes, any order really.
		regexStr = "^[0-9\\-]*$";
		System.out.println(Pattern.matches(regexStr,"97-8456-13-0-0"));
		System.out.println(Pattern.matches(regexStr,"9-7-8-4-5-6-1-3-0-0"));

		//matches 9999999999, 1-999-999-9999 and 999-999-9999
		regexStr = "^(1\\-)?[0-9]{3}\\-?[0-9]{3}\\-?[0-9]{4}$";
		System.out.println(Pattern.matches(regexStr,"9784561300"));
		System.out.println(Pattern.matches(regexStr,"9-784561300"));
		System.out.println(Pattern.matches(regexStr,"978-456-1300"));
		System.out.println(Pattern.matches(regexStr,"97-8456-13-0-0"));
	}
}
