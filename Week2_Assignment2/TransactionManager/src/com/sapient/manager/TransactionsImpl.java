package com.sapient.manager;

import java.io.IOException;

public class TransactionsImpl {

	 public static void main(String[] args) throws IOException {
		 String inCsvUrl="C:\\Users\\rajma\\eclipse-workspace\\PJP2.0\\Week2\\Week2_Assignment2\\sample_input.csv";
		 Parser.doParsing(inCsvUrl);
		 Parser.createOutput();
	 }
}
