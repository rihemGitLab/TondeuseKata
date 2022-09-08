package com.kata.model;

public enum Instruction {
	
	  AVANCE("A"),
	  ROTATE_LEFT("G"),
	  ROTATE_RIGHT("D");
	
    private String key;

    Instruction(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
      return this.key;
    }

  
}
