package domain;

public class Fragment {
	public Character letter;
	public int count;
	
	public Fragment(Character letter, int count) {
		this.letter = letter;
		this.count = count;
	}

	@Override
	public String toString() {
		return "Fragment [letter=" + letter + ", count=" + count + "]";
	}
	
}
