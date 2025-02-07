public class Character {
	private String type;
	private Attack useAttack;
	private Defend useDefend;

	Character(String type) {
		this.type = type;
	}

	void setAttack(Attack attack) {
		this.useAttack = attack;
	}

	void setDefense(Defend defend) {
		this.useDefend = defend;
	}

	public String attack() {
		return useAttack.attack(type);
	}

	public String defend() {
		return useDefend.defend();
	}

}
