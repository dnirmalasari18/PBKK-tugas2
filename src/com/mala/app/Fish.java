package com.mala.app;

public class Fish {
	private String fishName;
	private float fishMass;
	
	public Fish(String fishName, float fishMass) {
		super();
		this.setFishName(fishName);
		this.setFishMass(fishMass);
	}

	public Fish() {
		super();
	}

	public String getFishName() {
		return fishName;
	}

	public void setFishName(String fishName) {
		this.fishName = fishName;
	}

	public float getFishMass() {
		return fishMass;
	}

	public void setFishMass(float fishMass) {
		this.fishMass = fishMass;
	}
	
	
}
