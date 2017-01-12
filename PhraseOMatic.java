public class PhraseOMatic {
	public static void main (String[] args) {
		String[] WordListOne = {"24/7", "win-win", "never say never", "abc"};
		String[] WordListTwo = {"sticky", "smelly", "gross", "aligned", "leveraged"};
		String[] WordListThree = {"space", "vision", "industry", "legend", "game"};

// find out how many words are in each list
		int OneLength = WordListOne.length; 
		int TwoLength = WordListTwo.length; 
		int ThreeLength = WordListThree.length; 

		// generate three random numbers
		int rand1 = (int) (Math.random() * OneLength);
		int rand2 = (int) (Math.random() * TwoLength);
		int rand3 = (int) (Math.random() * ThreeLength);
// Now build a phrase
		String phrase = WordListOne[rand1] + " " + WordListTwo[rand2] + " " + WordListThree[rand3];
		System.out.println("What we need is a " + phrase); 
	}
}