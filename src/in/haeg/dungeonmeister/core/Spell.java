package in.haeg.dungeonmeister.core;

import java.util.Map;

public class Spell {
	private String m_Name;
	private String m_Description;
	private SpellType m_Type;
	private Map<Class, Integer> m_Levels;
	private TimePeriod m_CastingTime;
	private SpellRange m_Range;
	private TimePeriod m_Duration;
	private SavingThrow m_SavingThrow;
	private boolean m_SpellResistance;

	
}
