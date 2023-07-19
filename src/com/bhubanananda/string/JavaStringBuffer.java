package com.bhubanananda.string;

/**
 * The Class JavaStringBuffer.
 *
 * @author Bhubanananda
 */
public class JavaStringBuffer {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java

	}

}
