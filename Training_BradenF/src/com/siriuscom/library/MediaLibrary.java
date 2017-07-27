package com.siriuscom.library;

import java.util.ArrayList;
import java.util.List;

public class MediaLibrary<T> implements Runnable{

	//Design a class that acts as a library for the following kinds of media: book, video, and newspaper.
	//Provide one version of the class that uses generics and one that does not.
	//book media newspaper
	
	List<T> mediaFiles = new ArrayList<>();
	
	public void add(T file) {
		mediaFiles.add(file);
	}
	
	public T remove(T file) {
		return file;
	}
	
	public void displayMedia() {
		int length = mediaFiles.size();
		for(int i = 0; i < length; i++) {
			System.out.println(mediaFiles.get(i));
		}
	}
	
	public List<T> getMediaFiles() {
		return mediaFiles;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
