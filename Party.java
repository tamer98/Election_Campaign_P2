
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Party {
	public enum eFlow {Left, Center, Right};
	public static int num = 0;
	private int numofVoices, id;
	private String name;
	private eFlow flow;
	private Date dateOfCreation;
	private ArrayList<Candidate> candidates;


	public Party(String name, String flow, String dateOfCreation, ArrayList<Candidate> candidate) {
		id = num++;
		this.name = name;
		this.flow = eFlow.valueOf(flow);
		String[] str = dateOfCreation.split("/");
		this.dateOfCreation = new Date(Integer.parseInt(str[2]), (Integer.parseInt(str[1]) - 1),
				Integer.parseInt(str[0]));
		this.candidates = candidate;
		partyElecetion();
		sortByPartyElection();
	}

	public ArrayList<Candidate> getContenders() {
		return candidates;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getNumOfVoices() {
		return numofVoices;
	}

	public void partyElecetion() {
		Random rd = new Random();
		int quantityOfVoices = 0;
		int[] voices = new int[candidates.size()];

		for (int i = 0; i < candidates.size(); i++)
			voices[i] = rd.nextInt(candidates.size());

		for (int i = 0; i < voices.length; i++) {
			for (int j = 0; j < voices.length; j++) {
				if (i == voices[j])
					quantityOfVoices++;
			}
			candidates.get(i).setNumOfVoices(quantityOfVoices);
			quantityOfVoices = 0;
		}
	}

	public void sortByPartyElection() {
		Comparator<Candidate> compareByVoices = new Comparator<Candidate>() {
			public int compare(Candidate c1, Candidate c2) {
				if (c1.getNumOfVoices() < c2.getNumOfVoices())
					return 1;
				else if (c1.getNumOfVoices() == c2.getNumOfVoices())
					return 0;
				else
					return -1;
			}
		};
		Collections.sort(candidates, compareByVoices);
	}

	public void addingContender(Candidate c) {
		candidates.add(c);
	}

	public void addVote() {
		numofVoices++;
	}

	public boolean equals(Party other) {
		return (name.equals(other.name) && dateOfCreation.equals(other.dateOfCreation));
	}

	public String toString() {
		return "Party: " + name + ", flow - " + flow.name() + ", that creates in date - " + dateOfCreation.toString()
		+ " has " + numofVoices + " voices in the last election\n";

	}
}
