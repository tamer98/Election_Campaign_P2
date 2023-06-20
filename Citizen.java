
public class Citizen {

	public static final int AGE_FOR_VOTE = 2020;
	public static final int MIN_AGE = 18;
	public final int idLength = 9;
	protected String name;
	protected String lastVote;
	protected int id;
	protected int yearOfBorn;
	protected int ballotBoxNum;
	protected int sickDays;
	protected boolean inQuarantine;
	protected boolean isVoting;
	protected boolean isSick;


	public Citizen(String name, String id, int yearOfBorn, boolean inQuarantine) throws Exception {
		this.name = name;
		this.id = Integer.parseInt(id);
		this.inQuarantine = inQuarantine;
		isSick = false;
		if (id.length() != idLength) 
			throw new Exception("length of ID number is incorrect");
		if ((AGE_FOR_VOTE - yearOfBorn) < MIN_AGE)
			throw new Exception("age of the citizen is under 18");
		else 
			this.yearOfBorn = yearOfBorn;			
	}


	public Citizen(String name, int id, int yearOfBorn, boolean inQuarantine) {
		this.name = name;
		this.id = id;
		this.yearOfBorn = yearOfBorn;
		this.inQuarantine = inQuarantine;
	}


	public int age() {
		return AGE_FOR_VOTE - yearOfBorn;
	}


	public int getBallotBoxNum() {
		return ballotBoxNum;
	}


	public boolean getIsSick() {
		return isSick;
	}


	public boolean setBallotBoxNum(int id) {
		ballotBoxNum = id;
		return true;
	}


	public boolean setIsSick(boolean isSick) {
		this.isSick = isSick;
		return true;
	}


	public boolean isInQuarantine() {
		return inQuarantine;
	}


	public boolean setIsVoting(boolean isVoting) {
		this.isVoting = isVoting;
		return true;
	}


	public boolean getIsVoting() {
		return isVoting;
	}


	public boolean getInQuarantine() {
		return inQuarantine;
	}


	public boolean setInQuarantine(boolean inQuarantine) {
		this.inQuarantine = inQuarantine;
		return true;
	}


	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}


	public int getYearOfBorn() {
		return yearOfBorn;
	}


	public boolean setLastVote(String lastVote) {
		this.lastVote = lastVote;
		return true;
	}


	public String getLastVote() {
		return lastVote;
	}


	public boolean equals(Citizen other) {
		return id == other.getId();
	}


	public String toString() {
		StringBuffer sb = new StringBuffer("Citizen: " + name + "\nid - " + id + "\nborn in year - " + yearOfBorn
				+ "\nvoting in ballot box numer " + ballotBoxNum + "\nis ");
		if (inQuarantine)
			sb.append("in quarantine\nis ");
		else
			sb.append("not in quarantine\nis ");
		if (isVoting)
			sb.append("voted in the last election\n");
		else
			sb.append("not voted in the last election\n");
		return sb.toString();
	}
}
