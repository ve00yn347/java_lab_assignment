package com.ymsli.assignment5.Q01;

public class FileDownloaderSimulation {
	public static void main(String[] args) {
		for(int i=0; i<26; i++) {
			String fileUrl = "https://www.dropbox.com/photo"+i+".jpg";
			FileDownloader task = new FileDownloader(fileUrl);
			Thread thread = new Thread(task);
			thread.start();
		}
	}
}
