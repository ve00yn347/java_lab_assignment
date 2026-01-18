package com.ymsli.assignment4.Q01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		try {
			File file = new File("story.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String line;
			while((line = br.readLine()) != null) {
				line = line.replaceAll("[^a-zA-Z\\s]", "").toLowerCase().trim();
				if(line.isEmpty()) continue;
				String[] words = line.split("\\s+");

				for(String word: words) {		
					map.put(word, map.getOrDefault(word, 0)+1);	
				}
			}
			
			for(Map.Entry<String, Integer> entry: map.entrySet()) {
				System.out.println(entry.getKey()+ " appears "+ entry.getValue()+ " times.");
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
