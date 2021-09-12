package org.junit;

// Verilen bir kelimede ilk iki harf icersinde A var ise bu A'lar silinmeli
// AABC ==> BC, ABC ==> BC, BCDE ==> BCDE, BCAA ==> BCAA, AA ==> "", A ==> "", B ==> B

public class C02StringManipulator {
	
	
	public String deleteFirstTwoA(String str) {
		if ( str.length() <= 2) {
			return str.replaceAll("A", "");
		}
		String firstTwoChar = str.substring(0, 2);
		String rest = str.substring(2);
	
		
		return firstTwoChar.replaceAll("A", "") + rest;
	}
	
	
	
	
	
	
//	public static void main(String[] args) {
//		System.out.println(deleteFirstTwo("AABC"));
//		System.out.println(deleteFirstTwo("ABC"));
//		System.out.println(deleteFirstTwo("BCDE"));
//		System.out.println(deleteFirstTwo("BCAA"));
//		System.out.println(deleteFirstTwo("AA"));
//		System.out.println(deleteFirstTwo("A"));
//		System.out.println(deleteFirstTwo("B"));
//	}
	
	

//	public String deleteFirstTwoA(String s) {
//		
//		if ( s == null || s.length() == 0 ) return "";
//		if ( s.length() == 1 ) return s.equals("A") ? "" : s;
//		
//		for(int i = 0 ; i < 2 ; i++) {
//			if(s.charAt(i) == 'A') {
//				s = s.replace('A', ' ');
//			}
//		}
//		s = s.replaceAll(" ", "");
//		return s;
//	}
	
	
}
