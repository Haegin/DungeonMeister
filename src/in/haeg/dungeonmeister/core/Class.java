package in.haeg.dungeonmeister.core;

public class Class {
	
	private String name;
	private String description;
	private boolean starting;
	
	/* Begin getters and setters */
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isStarting() {
		return starting;
	}
	
	public void setStarting(boolean starting) {
		this.starting = starting;
	}

}
