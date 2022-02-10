package dayfive.patternexample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {
	//"abc adef fed abc def ghji"-- abc def
	// Pattern "abc def" we want to search in above String or character sequence
	//In Java we have Pattern api or class and it's provides us methods to search or match the pattern
	public static void main(String[] args) {
		/*
		 *   Pattern.compile method Compiles the given regular expression into a pattern.
		 *   .a is a regular expression
		 *   String or squence  of character which "pa" 
		 */
		
		Pattern p = Pattern.compile(".a");//.a is a regex representing a single character
		
		Matcher m = p.matcher("pa");// using matcher method we are trying to  
		boolean matches = m.matches();
		System.out.println(matches);
	
		boolean pattern= Pattern.compile(".a").matcher("sp").matches();
		System.out.println(pattern);
		
		System.out.println(Pattern.compile("..a").matcher("spa").matches());
		
		
		Pattern pat = Pattern.compile("^[\\w]+$");
		//Matcher match = pat.matcher("ABCDEFabcdef123450");
		//Matcher match = pat.matcher("SQL");
		Matcher match = pat.matcher("*&%@#!}{");
		System.out.println(match.matches());
		
		Pattern pq=Pattern.compile("pq*?",Pattern.CASE_INSENSITIVE);
		Matcher mp=pq.matcher("p");
		Matcher mpq=pq.matcher("pq");
		Matcher mpqq=pq.matcher("pqq");
		Matcher mpqr=pq.matcher("pqr");
		Matcher mprr=pq.matcher("prr");
		System.out.println("*********************");
		System.out.println(mp.matches());
		System.out.println(mpq.matches());
		System.out.println(mpqq.matches());
		System.out.println(mpqr.matches());
		System.out.println(mprr.matches());
		System.out.println("*********************");
		System.out.println(pq.matcher("pigeon").matches());
	
		System.out.println(Pattern.compile("[a-zA-Z0-9]").matcher("ASBDS123").matches());

	}

}
