package com.ymsli.assignment5.Q01;

import java.util.Random;

public class FileDownloader implements Runnable{
	private String fileUrl;
	
	public FileDownloader(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String fileName = fileUrl.substring(fileUrl.lastIndexOf("/")+1);
		System.out.println(Thread.currentThread().getName() + " starting download: "+ fileName);
		
		try {
			Random random = new Random();
			int sleepDuration = 200 + random.nextInt(300);
			Thread.sleep(sleepDuration);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception ocured: "+ e.getMessage());
		}
	}
	
}
