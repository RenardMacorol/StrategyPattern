public class Sword implements Attack {
	public String attack(String type) {
		String output = new String();
		output += type + " attacks with a sword!";
		return output;
	}

}
