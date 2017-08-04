package com.siriuscom.library;

import java.util.ArrayList;
import java.util.List;

public class NonGenericMediaLibrary {

	
	List<Media> mediaFiles = new ArrayList<>();
	
	public void add(Media file) {
		mediaFiles.add(file);
	}
	
	public Media remove(Media file) {
		return file;
	}
	
	public void displayMedia() {
		int length = mediaFiles.size();
		for(int i = 0; i < length; i++) {
			System.out.println(mediaFiles.get(i));
		}
	}
	
	public List<Media> getMediaFiles() {
		return mediaFiles;
	}
}
