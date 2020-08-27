package com.sapient.averageIncomeCalculator;

import java.io.IOException;

public class AverageIncomeImpl {

	public static void main(String[] args) throws IOException {
		String inputFileUrl = "C:\\Users\\rajma\\eclipse-workspace\\PJP2.0\\Week2\\Week2_Assignment3\\Sample_Input_File.csv";
		Parser.doParsing(inputFileUrl);
	    Parser.createOutput();
        
	}

}
