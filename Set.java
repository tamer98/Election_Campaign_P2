
import java.util.ArrayList;

public class Set <T extends Citizen> {
	private ArrayList<T> allData;


	public Set() {
		allData = new ArrayList<T>();
	}


	public boolean addData(T t) {
		for (int i = 0; i < allData.size(); i++) {
			if (allData.get(i).equals(t))
				return false;
		}
		allData.add(t);
		return true;
	}


	public ArrayList<T> getAllData(){
		return allData;
	}


	public T get(int index) {
		return allData.get(index);
	}


	public int size() {
		return allData.size();
	}
}