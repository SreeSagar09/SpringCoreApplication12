package com.app;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Products {
	private List<String> names;
	private Set<String> models;
	private Map<String, Double> price;
	private Properties notes;
	
	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	public Set<String> getModels() {
		return models;
	}

	public void setModels(Set<String> models) {
		this.models = models;
	}

	public Map<String, Double> getPrice() {
		return price;
	}

	public void setPrice(Map<String, Double> price) {
		this.price = price;
	}

	public Properties getNotes() {
		return notes;
	}

	public void setNotes(Properties notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Products [names=" + names + ", models=" + models + ", price=" + price + ", notes=" + notes + "]";
	}
	
}
