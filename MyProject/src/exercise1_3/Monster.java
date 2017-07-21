package exercise1_3;

public class Monster {
	// Member Variables (DATA)
	String m_name;
	int m_age;
			
	// Member Functions (BEHAVIORS)
	public String getName() {
		return m_name;
	}

	public void setName(String m_name) {
		this.m_name = m_name;
	}

	public int getAge() {
		return m_age;
	}

	public void setAge(int m_age) {
		this.m_age = m_age;
	}

	public static void main(String[] args) {
		Monster leviathon = new Monster();
		leviathon.setName("leviathon");
		leviathon.setAge(150);
		System.out.println("Monster name is " + leviathon.getName());
		System.out.println("Age is " + leviathon.getAge());
	}
}
