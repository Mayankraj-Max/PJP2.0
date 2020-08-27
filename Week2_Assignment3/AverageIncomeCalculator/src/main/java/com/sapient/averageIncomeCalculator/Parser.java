package com.sapient.averageIncomeCalculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Parser {

	static List<IncomeData> incomeDataList = new ArrayList<IncomeData>();

	public static void createOutput() throws IOException {
		String output = "";
		FileWriter fileWriter;

		fileWriter = new FileWriter(
				"C:\\Users\\rajma\\eclipse-workspace\\PJP2.0\\Week2\\Week2_Assignment3\\Sample_Output_File.csv");
		Collections.sort(incomeDataList);
		for (IncomeData incomeData : incomeDataList) {
			if (incomeData.countryName.equals(""))
				output += incomeData.cityName + ",";

			output += incomeData;
		}
		fileWriter.write(output);
		fileWriter.close();

	}

	public static void doParsing(String inputFileUrl) throws FileNotFoundException {

		File inFile = new File(inputFileUrl);
		FileReader fileReader = new FileReader(inFile);
		Scanner sc = new Scanner(fileReader);
		while (sc.hasNextLine()) {
			parseInputFile(sc.nextLine());
		}
		sc.close();
	}

	public static void parseInputFile(String line) {

		System.out.println(line);
		String[] temp = line.split(",");
		incomeDataList.add(new IncomeData(temp[0], temp[1], temp[2], temp[3], Double.parseDouble(temp[4])));
	}

}
