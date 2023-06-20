
public class Candidate extends Citizen{
	private String partyBelonging;
	private boolean isContending;
	private int numOfVoices;


	public  Candidate(String name, String id, int yearOfBorn, boolean inQuarantine, String partyBelonging,
			boolean isContending) throws Exception {
		super(name, id, yearOfBorn, inQuarantine);
		this.partyBelonging = partyBelonging;
		this.isContending = isContending;
	}
	public  Candidate(Citizen other, String partyBelonging) throws Exception {
		this(other.name, other.id + "", other.yearOfBorn, other.inQuarantine, partyBelonging, true);
	}


	public String getPartyBelonging() {
		return partyBelonging;
	}


	public boolean setNumOfVoices(int voices) {
		numOfVoices = voices;
		return true;
	}


	public int getNumOfVoices() {
		return numOfVoices;
	}


	public boolean equals(Candidate other) {
		return super.equals(other);
	}


	public String toString() {
		StringBuffer sb = new StringBuffer(super.toString());
		if (isContending)
			sb.append("is runing for " + partyBelonging + " party\n");
		return sb.toString();
	}
}
