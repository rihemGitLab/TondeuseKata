package com.kata.utils;

import java.util.List;

import com.kata.model.Pelouse;



public class PelouseReader {
	
	public static final String SEPARATOR = " ";
	

	    public static Pelouse read(List<String> fileRows) {
	    	
	        String pelouseLine = fileRows.get(0);
	        String [] pelouseArray = pelouseLine.split(SEPARATOR);
	        int longueur = Integer.parseInt(pelouseArray[0]);
	        int hauteur = Integer.parseInt(pelouseArray[1]);
	        return new Pelouse(longueur,hauteur);
	    }

}
