package com.kata.model;

import java.util.Arrays;


public enum Orientation {
	
	  NORTH("N"),
	  EAST("E"),
	  SOUTH("S"),
	  WEST("W");
	
    private String key;

    Orientation(String key) {
        this.key = key;
    }

    public String getKey() {
		return key;
	}

	@Override
    public String toString() {
      return this.key;
    }
    public static Orientation valueOfKey(String code) {
        return Arrays.stream(Orientation.values())
                .filter(orientation -> orientation.getKey().equals(code))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException());
    }
}
