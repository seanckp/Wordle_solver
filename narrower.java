import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class narrower {
	private static String [] fa;
	private static char zero;
	private static char one;
	private static char two;
	private static char three;
	private static char four;
	private static ArrayList<String> list;
	private static String [] defe;
	private static String [] defc;
	private static String [] defd;
	

	
	public narrower() throws IOException {
		word_importer wimp = new word_importer();
		wimp.done();
		fa = new String[wimp.retfa().length];
		fa = wimp.retfa();
		list = new ArrayList<String>();
		defe = new String[5];
		defc = new String[5];
		defd = new String[5];
		for(int x = 0;x <fa.length;x++) {
			list.add(fa[x]);
		}
	}
	
	
	public void listcreation(String code, String triedword) {
		zero = triedword.charAt(0);
		one = triedword.charAt(1);
		two = triedword.charAt(2);
		three = triedword.charAt(3);
		four = triedword.charAt(4);
		
		if(code.charAt(0)=='2') {
			defe[0] =""+zero;
		}
		else if(code.charAt(0)=='1') {
			defc[0]=""+zero;
		}else {
			defd[0] = ""+zero;
		}
		if(code.charAt(1)=='2') {
			defe[1]=""+one;
		}
		else if(code.charAt(1)=='1') {
			defc[1]=""+one;
		}else {
			defd[1]=""+one;
		}
		if(code.charAt(2)=='2') {
			defe[2]=""+two;
		}
		else if(code.charAt(2)=='1') {
			defc[2]=""+two;
		}else {
			defd[2]=""+two;
		}
		if(code.charAt(3)=='2') {
			defe[3]=""+three;
		}
		else if(code.charAt(3)=='1') {
			defc[3]=""+three;
		}else {
			defd[3]=""+three;
		}
		if(code.charAt(4)=='2') {
			defe[4]=""+four;
		}
		else if(code.charAt(4)=='1') {
			defc[4]=""+four;
		}else {
			defd[4]=""+four;
		}
		for(int l=0;l<5;l++) {
			if(defe[l]==null) {
				defe[l] = ".";
			}
			if(defd[l]==null) {
				defd[l] = "";
			}
			if(defc[l]==null) {
				defc[l] = "";
			}
		}

		String s_defe = defe[0].concat(defe[1]).concat(defe[2]).concat(defe[3]).concat(defe[4]);

		//String s_defc = defc[0].concat(defc[1]).concat(defc[2]).concat(defc[3]).concat(defc[4])+"\\\\.?";

		
		
		for(int i =0;i<list.size();i++) {
			Pattern pt = Pattern.compile(s_defe);
			Matcher mt = pt.matcher(list.get(i));
			if(!mt.find()) {
				//System.out.println(fa[i]);
				list.set(i, "0");
			}
			
		}
		cleanup();
		//System.out.println(list);
		for(int i =0;i<list.size();i++) {
			String temp =list.get(i);
			if(defd[0] == "") {	
			}else {
				if(list.get(i).contains(defd[0])) {
					list.set(i, "0");
				}
			}
			if(defd[1] == "") {	
			}else {
				if(list.get(i).contains(defd[1])&& temp.charAt(2)+""!= ""+defd[3]) {
					list.set(i, "0");
				}
			}
			if(defd[2] == "") {	
			}else {
				if(list.get(i).contains(defd[2])&& temp.charAt(0)+""!= ""+defd[2]) {
					list.set(i, "0");
				}
			}
			if(defd[3] == "") {	
			}else {
				if(list.get(i).contains(defd[3])) {
					list.set(i, "0");
				}
			}
			if(defd[4] == "") {	
			}else {
				if(list.get(i).contains(defd[4])) {
					list.set(i, "0");
				}
			}
		}
		cleanup();
		
		
		for(int i =0;i<list.size();i++) {
			if(defc[0] == "") {	
			}else {
				if(!list.get(i).contains(defc[0])) {
					list.set(i, "0");
				}
			}
			if(defc[1] == "") {	
			}else {
				if(!list.get(i).contains(defc[1])) {
					list.set(i, "0");
				}
			}
			if(defc[2] == "") {	
			}else {
				if(!list.get(i).contains(defc[2])) {
					list.set(i, "0");
				}
			}
			if(defc[3] == "") {	
			}else {
				if(!list.get(i).contains(defc[3])) {
					list.set(i, "0");
				}
			}
			if(defc[4] == "") {	
			}else {
				if(!list.get(i).contains(defc[4])) {
					list.set(i, "0");
				}
			}
		}
		cleanup();
		System.out.println(list);

	}
	public void cleanup() {
		for(int x=0;x<list.size();x++) {
			if(list.get(x).equals("0")) {
				list.remove(x);
				x--;
			}
		}
	}
	public String nexttry() {
//		Random rand = new Random();
//		int chosen = rand.nextInt(list.size());
//		String chosen_word = list.get(chosen);
		//System.out.println(chosen_word);
		return list.get(0);
	}
	

}
