public class CastSpell implements Attack {
	public String attack(String type) {
		String output = new String();
		output += type + " casts a spell!";
		return output;
	}

}
