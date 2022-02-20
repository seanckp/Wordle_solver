import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class word_importer {
	private static String [] fa;
	public word_importer() throws IOException{
		String temp = "crane";
		File words = new File("words.txt");
		Scanner readin = new Scanner(words);
		while(readin.hasNext()) {
			temp = temp.concat(","+readin.next());
		}
		fa = new String[temp.length()];
		fa = temp.split(",");
		readin.close();
		//System.out.println(fa[0]);
	}
	public String done() {
		String temp = "Successfully initialised!";
		return temp;
	}
	public String [] retfa() {
		return fa;
	}
	public String nexttry() {
		Random rand = new Random();
		int chosen = rand.nextInt(fa.length);
		String chosen_word = fa[chosen];
		//System.out.println(chosen_word);
		return chosen_word;
	}


}
