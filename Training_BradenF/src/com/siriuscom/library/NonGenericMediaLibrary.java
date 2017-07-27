package com.siriuscom.library;

import java.util.ArrayList;
import java.util.List;

public class NonGenericMediaLibrary {

	
	List<Object> mediaFiles = new ArrayList<>();
	
	public void add(Object file) {
		mediaFiles.add(file);
	}
	
	public Object remove(Object file) {
		return file;
	}
	
	public void displayMedia() {
		int length = mediaFiles.size();
		for(int i = 0; i < length; i++) {
			System.out.println(mediaFiles.get(i));
		}
	}
	
	public List<Object> getMediaFiles() {
		return mediaFiles;
	}
}
