package com.kata.model;

import java.util.List;

public class TondeuseInstruction {
	

	private Tondeuse tondeuse;
	private List<String> instructions;
	public TondeuseInstruction(Tondeuse tondeuse, List<String> instructions) {
		super();
		this.tondeuse = tondeuse;
		this.instructions = instructions;
	}
	
	
	@Override
	public String toString() {
		return "TondeuseInstruction [tondeuse=" + tondeuse + ", instructions=" + instructions + "]";
	}


	public Tondeuse getTondeuse() {
		return tondeuse;
	}


	public void setTondeuse(Tondeuse tondeuse) {
		this.tondeuse = tondeuse;
	}


	public List<String> getInstructions() {
		return instructions;
	}


	public void setInstructions(List<String> instructions) {
		this.instructions = instructions;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((instructions == null) ? 0 : instructions.hashCode());
		result = prime * result + ((tondeuse == null) ? 0 : tondeuse.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TondeuseInstruction other = (TondeuseInstruction) obj;
		if (instructions == null) {
			if (other.instructions != null)
				return false;
		} else if (!instructions.equals(other.instructions))
			return false;
		if (tondeuse == null) {
			if (other.tondeuse != null)
				return false;
		} else if (!tondeuse.equals(other.tondeuse))
			return false;
		return true;
	}
	
	
}