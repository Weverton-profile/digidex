package br.com.digidex.model;

public class Skills {
	
	private String skill;
	private String translation;
	private String description;
	
	public Skills(String skill, String translation, String description) {
		this.skill = skill;
		this.translation = translation;
		this.description = description;
	}

	public String getSkill() {
		return skill;
	}

	public String getTranslation() {
		return translation;
	}

	public String getDescription() {
		return description;
	}
}
