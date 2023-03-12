package br.com.digidex.model;

public class DigEv {
	
	private Long id;
	private String digimon;
	private String condition;
	
	public DigEv(String digimon, String condition) {
		this.digimon = digimon;
		this.condition = condition;
	}

	public String getDigimon() {
		return digimon;
	}

	public String getCondition() {
		return condition;
	}

	public Long getId() {
		return id;
	}

}
