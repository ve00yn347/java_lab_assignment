package com.ymsli.assignment4.Q03;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxDouble {
	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
			String line;
			while((line = br.readLine()) != null) {
				line = line.trim();
				if(line.isEmpty()) {
					continue;
				}
				try {
					double num = Double.parseDouble(line);
					list.add(num);
				} catch (NumberFormatException e) {
					// TODO: handle exception
				}
				
			}
			if (list.isEmpty()) {
                System.out.println("File is empty or contains no valid numbers");
            } else {
                double max = Collections.max(list);
                System.out.println("Largest value: " + max);
            }
		} catch (FileNotFoundException e) {
		    System.out.println("File not found. Please check the file path.");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
	}
}
