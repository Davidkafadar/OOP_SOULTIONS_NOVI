package pckg_github;

import java.util.Comparator;

public class Robot implements Comparable<Robot>{
	
	
	private String name;
	
	private int id;
	
	private static int cntID = 10;
	
	private static final int MinL = 3;
	
	private static final int MaxL = 15;
	
	private static final String Alph = "abcdefghijklmnoprstuvzxywABCDEFGHIJKLMNOPRSTUVZXY0123456789";
	
	public Robot(String name) {
		this.name = generateName();
		this.id = cntID++;
		
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

		
	
	private String generateName() {
		String name = "";
		int lng_chars = (int)(Math.random()*(MaxL - MinL)) + MinL;
		for (int k = 0; k< lng_chars; k++) {
			int pos = (int)(Math.random()*(Alph.length()-1));
			name += Alph.charAt(pos);
			
		}
		return name;
		
		
	}

	@Override
	public String toString() {
		return name =  "name=" + name;
	}
	@Override
	public int compareTo(Robot o2) {
		if(this.getName().length() > o2.getName().length()) {
			return 1;
		}else if(this.getName().length() < o2.getName().length()) {
			return -1 ;
		}else {
			return 0;
		}
	}
	

}
