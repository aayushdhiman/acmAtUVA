import java.util.Scanner;

public class CaesarsCipher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		String[] arr = new String[cases];
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		for(int i = 0; i < cases; i++) {
			int shiftVal = scan.nextInt();
			String message = scan.next();
			scan.nextLine();
			for(int j = 0; j<message.length(); j++) {
				for(int index = 0; index < alphabet.length; index++) {
					int num = shiftVal % 26;
					if(message.charAt(j) == alphabet[index]) {
						if((index+shiftVal) > alphabet.length-1) {
							int k = shiftVal - (alphabet.length-index);
							index= 0;
							num = k;
						}//if
//						message.charAt(j).replace(alphabet[index+num]);
						message = message.substring(0, message.indexOf(message.charAt(j))) + alphabet[index + num] + message.substring(message.indexOf(message.charAt(j)));
					}//if
				}//for
			}//for
			arr[i]= message;
		}//for
		for(String temp : arr) {
			System.out.println("" + temp);
		}//for
	}//main

}//class
