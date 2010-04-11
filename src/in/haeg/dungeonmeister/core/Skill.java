package in.haeg.dungeonmeister.core;

import java.util.List;

public class Skill {
	private String m_Name;
	private String m_Description;
	private List<Skill> m_Synergies;
	
	public String getName() {
		return m_Name;
	}
	
	public void setName(String a_Name) {
		m_Name = a_Name;
	}
	
	public String getDescription() {
		return m_Description;
	}
	
	public void setDescription(String a_Description) {
		m_Description = a_Description;
	}
	
	public List<Skill> getSkillSynergies() {
		return m_Synergies;
	}
	
	public void setSkillSynergies(List<Skill> a_Synergies) {
		m_Synergies = a_Synergies;
	}
}
