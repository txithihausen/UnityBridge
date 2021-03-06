package com.nees.senativos.requesthandler;

import java.util.LinkedList;

public class EmotionQueue extends LinkedList<String> {
	
	private static final long serialVersionUID = 5763935562975956777L;
	private static EmotionQueue instance = null;
	
	private EmotionQueue() {
		super();
	}
	
	public static EmotionQueue getInstance() {
		if(instance == null) {
			instance = new EmotionQueue();
		}
		return instance;
	}
	

}
