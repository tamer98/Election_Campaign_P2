
import java.util.ArrayList;



public class BallotBox <T extends Citizen>{
	public static int num = 1;
	protected int[] result;
	protected ArrayList<Party> parties;
	protected int id;
	protected String address;
	protected String type;
	protected ArrayList<Citizen> voters;
	protected double votersPercent;



	public BallotBox(String address, ArrayList<Party> parties, int numOfParties, String type) {
		id = num++;
		setResult(numOfParties);
		this.parties = parties;
		this.address = address;
		this.type = type;
		voters = new ArrayList<Citizen>();
		for (int i = 0; i < voters.size(); i++)
			voters.get(i).setBallotBoxNum(id);
		setVotersPercent();

	}

	public boolean setAddress(String address) {
		this.address = address;
		return true;

	}
	public ArrayList<Citizen> getVoters() {
		return voters;
	}



	public int getId() {
		return id;
	}



	public String getType() {
		return type;
	}


	public boolean setResult(int numOfParties) {
		result = new int[numOfParties];
		return true;
	}



	public void addVoiceToParty(Party p) {
		result[parties.indexOf(p)]++;
	}


	public void addVoter(Citizen c) {
		voters.add(c);
	}

	public void vote() {
		for (int i = 0; i < voters.size(); i++) {
			if (voters.get(i).getIsVoting()) {
				for (int j = 0; j < parties.size(); j++) {
					if (voters.get(i).getLastVote().equals(parties.get(j).getName()))
						addVoiceToParty(parties.get(j));
				}
			}
		}
		sortParties();
		sort();
		setVotersPercent();
	}

	public void sort() {
		for (int i = 1; i < result.length; i++) {
			for (int j = i; j > 0 && result[j - 1] < result[j]; j--) {
				int temp = result[j];
				result[j] = result[j - 1];
				result[j - 1] = temp;
			}
		}
	}


	public void sortParties() {
		for (int i = 1; i < parties.size(); i++) {
			for (int j = i; j > 0 && result[j - 1] < result[j]; j--) {
				Party p = parties.get(j);
				int temp = parties.indexOf(parties.get(j));
				parties.remove(temp);
				parties.add(temp - 1, p);
			}
		}
	}

	public boolean setVotersPercent() {
		if (voters.size() == 0) {
			votersPercent = 0;
			return false;
		}

		double quantityOfVotes = 0;
		for (int i = 0; i < voters.size(); i++) {
			if (voters.get(i).getIsVoting())
				quantityOfVotes++;
		}
		votersPercent = ((quantityOfVotes / voters.size()) * 100);
		return true;
	}


	public int voicesForParty(String name) {
		int voices = 0;
		for (int i = 0; i < voters.size(); i++) {
			if (voters.get(i).getLastVote() != null) {
				if (voters.get(i).getLastVote().equals(name))
					voices++;
			}
		}
		return voices;
	}



	public boolean equals(T other) {
		return (id == other.id);
	}


	public String toString() {
		setVotersPercent();
		StringBuffer sb = new StringBuffer("Ballot Box " + id + " in address " + address + " has " + votersPercent
				+ "% of voting in the last election\n");
		for (int i = 0; i < parties.size(); i++)
			sb.append(parties.get(i).toString() + " has " + voicesForParty(parties.get(i).getName())
			+ " voices in that ballot box in the last election\n");
		return sb.toString();
	}
}

