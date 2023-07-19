package com.bhubanananda.string;

/**
 * The Class JavaStringBuilder.
 *
 * @author Bhubanananda
 */
public class JavaStringBuilder {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("test StringBuilder");
		System.out.println(sb);

		sb.append(" in Java");// now original string is changed
		System.out.println(sb);// prints Hello Java

		StringBuilder sb1 = new StringBuilder();
		sb1.append(new StringBuffer("sss"));
	}

}
