package in.haeg.dungeonmeister.core;

public class Class {
	
	private String m_Name;
	private String m_Description;
	private boolean m_Starting;
	
	/* Begin getters and setters */
	
	public String getName() {
		return m_Name;
	}
	
	public void setName(String a_Name) {
		this.m_Name = a_Name;
	}
	
	public String getDescription() {
		return m_Description;
	}
	
	public void setDescription(String a_Description) {
		this.m_Description = a_Description;
	}
	
	public boolean isStarting() {
		return m_Starting;
	}
	
	public void setStarting(boolean a_Starting) {
		this.m_Starting = a_Starting;
	}
}
