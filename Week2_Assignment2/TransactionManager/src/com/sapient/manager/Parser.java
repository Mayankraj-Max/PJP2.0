package com.sapient.manager;

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

	
    static	List<Transactions> transactionList=new ArrayList<Transactions>();
	public static void doParsing(String inCsvUrl) throws FileNotFoundException {
		File inFile=new File(inCsvUrl);
		FileReader fileReader=new FileReader(inFile);
		Scanner sc=new Scanner(fileReader);
		parseInputFile(sc.nextLine().substring(3));
		while(sc.hasNextLine()) {
			parseInputFile(sc.nextLine());
		}
		sc.close();
	}
   
	private static void parseInputFile(String line) {
	    System.out.println(line);
		String [] temp=line.split(",");
		if(temp[2].equals("")) {
			transactionList.add(new NormalTransaction(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]),temp[3],temp[4],Integer.parseInt(temp[5]),temp[6] == "Y" ? true : false));
		}else {
			transactionList.add(new IntradayTransaction(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]),temp[2],temp[3],temp[4],Integer.parseInt(temp[5])));
		}
		
	}

	public static void createOutput() throws IOException {

		String output = "";
		FileWriter fileWriter = new FileWriter("C:\\Users\\rajma\\eclipse-workspace\\PJP2.0\\Week2\\Week2_Assignment2\\sample_output.csv");
		Collections.sort(transactionList);
		for( Transactions val : transactionList) {
			output += val;
		}
		fileWriter.write(output);
		fileWriter.close();		
	}

}
