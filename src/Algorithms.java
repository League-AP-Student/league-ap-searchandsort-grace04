import java.util.List;

public class Algorithms {

	public static Object findBrokenEgg(List<String> eggs) {
		// TODO Auto-generated method stub
		for(int i=0;i<eggs.size();i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return null;
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0;i<oysters.size();i++) {
			if(oysters.get(i)) {
				count++;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		Double highest = peeps.get(0);
		Double current;
		for(int i=0;i<peeps.size();i++) {
			current = peeps.get(i);
			if(current>highest) {
				highest = current;
			}
		}
		return highest;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		int longest = words.get(0).length();
		String word = words.get(0);
		int current;
		for(int i=0;i<words.size();i++) {
			current = words.get(i).length();
			if(current>longest) {
				longest = current;
				word = words.get(i);
			}
		}
		return word;
	}

	public static Object containsSOS(List<String> message) {
		// TODO Auto-generated method stub
		return message.contains(" ... --- ... ");
	}

	public static List<String> sortScores(List<Double> results) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		// TODO Auto-generated method stub
		String set = unsortedSequences.get(0);
		String current;
		for(int i=0;i<unsortedSequences.size();i++) {
			current = unsortedSequences.get(i);
			if(current.length()<set.length()) {
				unsortedSequences.remove(current);
				unsortedSequences.add(0, current);
			}
			else if(current.length()>set.length()){
				unsortedSequences.remove(current);
				unsortedSequences.add(unsortedSequences.size()-1, current);
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		return null;
	}

}
