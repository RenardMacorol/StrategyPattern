public class Main {
	public static void main(String[] args) {
		CreateMagic createMagic = new CreateMagic();
		Shield shield = new Shield();
		Dodge dodge = new Dodge();

		Sword sword = new Sword();
		CastSpell castSpell = new CastSpell();
		ShootArrow shootArrow = new ShootArrow();

		Knight knight = new Knight("Knight");
		knight.setAttack(sword);
		knight.setDefense(shield);
		System.out.println(knight.attack());
		System.out.println(knight.defend());
		knight.setDefense(createMagic);
		System.out.println(knight.defend());
		knight.setDefense(dodge);
		System.out.println(knight.defend());

		Wizard wizard = new Wizard("Wizard");
		wizard.setDefense(createMagic);
		wizard.setAttack(castSpell);
		System.out.println(wizard.defend());
		System.out.println(wizard.attack());

		Archer archer = new Archer("Archer");
		archer.setAttack(shootArrow);
		archer.setDefense(dodge);
		System.out.println(archer.attack());
		System.out.println(archer.defend());

	}
}
