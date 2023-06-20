
import java.util.ArrayList;



public class Election {
	private int month, year;
	private ArrayList<Citizen> citizens;
	private ArrayList<Party> parties;
	private ArrayList<BallotBox> boxes;
	private String result;


	public Election(int month, int year, ArrayList<Citizen> citizens, ArrayList<Party> parties,
			ArrayList<BallotBox> boxes) {
		setMonth(month);
		this.year = year;
		this.citizens = new ArrayList<Citizen>();

		for (int i = 0; i < citizens.size(); i++)
			this.citizens.add(i, citizens.get(i));
		this.parties = new ArrayList<Party>();

		for (int i = 0; i < parties.size(); i++)
			this.parties.add(i, parties.get(i));
		this.boxes = new ArrayList<BallotBox>();

		for (int i = 0; i < boxes.size(); i++)
			this.boxes.add(i, boxes.get(i));
	}


	public boolean setMonth(int month) {
		if (month < 1 || month > 12) {
			month = 1;
			return false;
		}
		this.month = month;
		return true;
	}


	public int getMonth() {
		return month;
	}


	public int getYear() {
		return year;
	}


	public String getResult() {
		return result;
	}


	public void sortParties() {
		for (int i = 1; i < parties.size(); i++) {
			for (int j = i; j > 0 && parties.get(j - 1).getNumOfVoices() < parties.get(j).getNumOfVoices(); j--) {
				Party p = parties.get(j);
				int temp = parties.indexOf(parties.get(j));
				parties.remove(temp);
				parties.add(temp - 1, p);
			}
		}
	}


	public double votingPercent() {
		double quantity = 0;
		for (int i = 0; i < citizens.size(); i++) {
			if (citizens.get(i).getIsVoting())
				quantity++;
		}
		return (double) ((quantity / citizens.size() * 100));
	}


	public boolean exist(int month, int year) {
		return (this.month == month && this.year == year);
	}


	public boolean equals(Election other) {
		return (month == other.month && year == other.year);
	}


	public void saveResults() {
		result = toString();
	}


	public String toString() {
		sortParties();
		StringBuffer sb = new StringBuffer(
				"election round in " + month + "/" + year + " results:\n");
		sb.append("The election has " + votingPercent() + "% of voting\n");

		for (int i = 0; i < parties.size(); i++)
			sb.append(parties.get(i).toString());

		for (int i = 0; i < boxes.size(); i++)
			sb.append(boxes.get(i).toString());
		return sb.toString();
	}
}
