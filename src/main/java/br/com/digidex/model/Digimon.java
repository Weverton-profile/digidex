package br.com.digidex.model;

import java.util.List;

public class Digimon {

	private Long id;
	private String name;
	private List<Images> images;
	private List<Levels> levels;
	private List<Types> types;
	private List<Attributes> attributes;
	private List<Fields> fields;
	private List<Descriptions> descriptions;
	private List<DigEv> priorEvolutions;
	private List<DigEv> nextEvolutions;
	

	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Images> getImages() {
		return images;
	}
	
	public List<Levels> getLevels() {
		return levels;
	}
	
	public List<Types> getTypes() {
		return types;
	}
	
	public List<Attributes> getAttributes() {
		return attributes;
	}
	
	public List<Fields> getFields() {
		return fields;
	}

	public List<DigEv> getPriorEvolutions() {
		return priorEvolutions;
	}
	
	public List<DigEv> getNextEvolutions() {
		return nextEvolutions;
	}

	public List<Descriptions> getDescriptions() {
		return descriptions;
	}
	
}
