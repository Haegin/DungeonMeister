package in.haeg.dungeonmeister.core;

import java.util.List;

public class Race {
	
	private String name;
	private String description;
	private String personality;
	private String physicalDescription;
	private String relations;
	private String alignment;
	private String lands;
	private String religion;
	private String language;
	private NameList names;
	private String adventurers;
	private List<RacialTraits> traits;

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

	public String getPersonality() {
		return personality;
	}

	public void setPersonality(String personality) {
		this.personality = personality;
	}

	public String getPhysicalDescription() {
		return physicalDescription;
	}

	public void setPhysicalDescription(String physicalDescription) {
		this.physicalDescription = physicalDescription;
	}

	public String getRelations() {
		return relations;
	}

	public void setRelations(String relations) {
		this.relations = relations;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	public String getLands() {
		return lands;
	}

	public void setLands(String lands) {
		this.lands = lands;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<String> getMaleNames() {
		return names.getMaleNames();
	}
	
	public List<String> getFemaleNames() {
		return names.getFemaleNames();
	}

	public void setMaleNames(List<String> names) {
		this.names.setMaleNames(names);
	}
	
	public void setFemaleNames(List<String> names) {
		this.names.setFemaleNames(names);
	}

	public String getAdventurers() {
		return adventurers;
	}

	public void setAdventurers(String adventurers) {
		this.adventurers = adventurers;
	}

	public List<RacialTraits> getTraits() {
		return traits;
	}

	public void setTraits(List<RacialTraits> traits) {
		this.traits = traits;
	}

	class NameList {
		private List<String> male;
		private List<String> female;

		NameList(List<String> male, List<String> female) {
			this.male = male;
			this.female = female;
		}
		
		/* Getters and Setters */

		public List<String> getMaleNames() {
			return male;
		}

		public void setMaleNames(List<String> male) {
			this.male = male;
		}

		public List<String> getFemaleNames() {
			return female;
		}

		public void setFemaleNames(List<String> female) {
			this.female = female;
		}
		
	}
}
