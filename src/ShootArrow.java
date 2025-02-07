public class ShootArrow implements Attack {
	public String attack(String type) {
		String output = new String();
		output += type + " shoots an arrow!";
		return output;
	}

}
