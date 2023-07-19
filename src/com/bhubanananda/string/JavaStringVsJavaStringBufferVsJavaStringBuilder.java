package com.bhubanananda.string;

/**
 * The Class JavaStringVsJavaStringBufferVsJavaStringBuilder.
 *
 * @author Bhubanananda
 */
public class JavaStringVsJavaStringBufferVsJavaStringBuilder {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

//		  Performance Test of String and StringBuffer and StringBuilder
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println(
				"Time taken by Concating with  StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

		startTime = System.currentTimeMillis();
		concatWithStringBuilder();
		System.out.println(
				"Time taken by Concating with  StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");

		System.out.println();
		System.out.println("=========================================");
		System.out.println();

		// Hashcode test of String and StringBuffer and StringBuilder
		hashcodeWithString();
		hashcodeWithStringBuffer();
		hashcodeWithStringBuilder();
	}

	/**
	 * Concat with string.
	 */
	static void concatWithString() {
		String t = "Bhubanananda";
		for (int i = 0; i < 100000; i++) {
			t = t + "Khadiratna";
		}
	}

	/**
	 * Concat with string buffer.
	 */
	static void concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("Bhubanananda");
		for (int i = 0; i < 100000; i++) {
			sb.append("Khadiratna");
		}
	}

	/**
	 * Concat with string builder.
	 */
	static void concatWithStringBuilder() {
		StringBuilder sb = new StringBuilder("Bhubanananda");
		for (int i = 0; i < 100000; i++) {
			sb.append("Khadiratna");
		}
	}

	/**
	 * Hashcode with string.
	 */
	static void hashcodeWithString() {
		System.out.println("Hashcode test of String:");
		String str = "Bhubanananda";
		System.out.println(str.hashCode());
		str = str + "Khadiratna";
		System.out.println(str.hashCode());
	}

	/**
	 * Hashcode with string buffer.
	 */
	static void hashcodeWithStringBuffer() {
		System.out.println("Hashcode test of StringBuffer:");
		StringBuffer sb = new StringBuffer("Bhubanananda");
		System.out.println(sb.hashCode());
		sb.append("Khadiratna");
		System.out.println(sb.hashCode());
	}

	/**
	 * Hashcode with string builder.
	 */
	static void hashcodeWithStringBuilder() {
		System.out.println("Hashcode test of StringBuffer:");
		StringBuilder sb = new StringBuilder("Bhubanananda");
		System.out.println(sb.hashCode());
		sb.append("tpKhadiratnaoint");
		System.out.println(sb.hashCode());
	}
}
