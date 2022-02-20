import java.io.IOException;
import java.util.Scanner;

public class class_main {
	private static String trying;

	public static void main(String[] args) throws IOException {
		narrower narrow = new narrower();
		word_importer wimp = new word_importer();
		wimp.done();
		String [] fa = new String[wimp.retfa().length];
		fa = wimp.retfa();
		trying =wimp.nexttry();
		System.out.println("Try "+trying+" for your first try.");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		narrow.listcreation(input, trying);
		
		trying =narrow.nexttry();
		System.out.println("Try "+trying+" next");
		//sc.next();
		input = sc.nextLine();
		narrow.listcreation(input, trying);
		
		trying =narrow.nexttry();
		System.out.println("Try "+trying+" next");
		//sc.next();
		input = sc.nextLine();
		narrow.listcreation(input, trying);
		
		trying =narrow.nexttry();
		System.out.println("Try "+trying+" next");
		//sc.next();
		input = sc.nextLine();
		narrow.listcreation(input, trying);
		
		trying =narrow.nexttry();
		System.out.println("Try "+trying+" next");
		//sc.next();
		input = sc.nextLine();
		narrow.listcreation(input, trying);
		
		
		
		
		
		
		

	}

}
