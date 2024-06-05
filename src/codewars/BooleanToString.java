package codewars;

import java.lang.classfile.instruction.ConvertInstruction;

public class BooleanToString {
	
	public static String covertOne(boolean b) {
		return b ? "true" : "false";
	}
	
	public static String converTwo(boolean b) {
		return Boolean.toString(b);
	}
	
	public static String converThree(boolean b) {
		return "" + b;
	}
	public static String converFour(boolean b) {
		return String.valueOf(b);
	}
	
	public static String converFive(boolean b) {
		String f = "";
	    if( b==true) {
	      f = "true";
	    } 
	    if(b==false){
	      f = "false";
	    }
		return f;
	}
	
	public static void main(String[] args) {
		System.out.println(covertOne(false));
		
		System.out.println(converTwo(true));
		
		System.out.println(converThree(true));
		
		System.out.println(converFour(true));
		
		System.out.println(converFive(false));
	}
}
