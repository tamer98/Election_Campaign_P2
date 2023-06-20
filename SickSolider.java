
public class SickSolider extends Solider implements SickInterface {

	public SickSolider(String name, String id, int yearOfBorn, boolean inQuarantine,boolean carryWeapon) throws Exception {
		super(name, id, yearOfBorn, inQuarantine, carryWeapon);
		this.sickDays = sickDays;
		isSick = true;
	}

	public SickSolider(Citizen c, boolean carryWeapon) {
		super (c, carryWeapon);
		isSick = true;
	}

	@Override
	public int getSickDays() {
		return sickDays;
	}


	@Override
	public void setSickDays(int sickDays) {
		this.sickDays = sickDays;

	}









}
