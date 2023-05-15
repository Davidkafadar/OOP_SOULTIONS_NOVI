package solution1;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class AUXCLS {
	
	private static List<String> lista;
	private static final String FilePath = "data.txt";
	
	
	public static void readDataFromFile(String filePath){
		lista = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
			
			String line;
			while((line=br.readLine())!= null) {
				String[] elements = line.split(",");
				for(String element : elements) {
					element = element.strip();
					lista.add(element);
				}
				
				
				
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public static  List<String> getLista(){
		return lista;
		
		
	}
	
	
	
	public static String getRandomCountryToGuess() {
		String randomCntr = null;
		int sz = lista.size();
		int indx = ThreadLocalRandom.current().nextInt(0, sz);
		randomCntr = lista.get(indx);
		return randomCntr;
		
	}
	public static void providePrintWithUnderScores(String country) {
		int numUnderScore = country.length()/2;
		Set<Integer> indx = new TreeSet<>();
		while(indx.size() < numUnderScore) {
			indx.add(ThreadLocalRandom.current().nextInt(0, country.length()));
		}
		char[] chars = country.toCharArray();
		Iterator<Integer> iterator = indx.iterator();
		for (int k = 0; k < numUnderScore; k++) {
			int idx = iterator.next();
			if(chars[idx] ==' ') {
				continue;
			}else {
				chars[idx] = '_';
			}
		}
		String gameString = new String(chars);
		System.out.println(Arrays.toString(chars));
		System.out.println(gameString);
		
	}

}
