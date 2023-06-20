
public class Solider extends Citizen {

	public static final int AGE_FOR_SOLDIER = 21;
	protected boolean carryWeapon;

	public Solider(String name, String id, int yearOfBorn, boolean inQuarantine, boolean carryWeapon) throws Exception {
		super(name, id, yearOfBorn, inQuarantine);
		this.carryWeapon = carryWeapon;
	}

	public Solider(String name, int id, int yearOfBorn, boolean inQuarantine, boolean carryWeapon) {
		super(name, id, yearOfBorn, inQuarantine);
		this.carryWeapon = carryWeapon;
	}

	public Solider(Citizen c, boolean carryWeapon) {
		this(c.name, c.id, c.yearOfBorn, c.inQuarantine, carryWeapon);
	}


	public boolean getCarryWeapon() {
		return carryWeapon;
	}

	public void SetCArryWeapon(boolean carryWeapon) {
		this.carryWeapon = carryWeapon;
	}
}
