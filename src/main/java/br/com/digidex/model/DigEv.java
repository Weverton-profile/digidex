package br.com.digidex.model;

public class DigEv {
	
	private String digimon;
	private String condition;
	private String image;
	
	public DigEv(String digimon, String condition, String image) {
		this.digimon = digimon;
		this.condition = condition;
		this.image = image;
	}

	public String getDigimon() {
		return digimon;
	}

	public String getCondition() {
		return condition;
	}

	public String getImage() {
		return image;
	}
	
}
