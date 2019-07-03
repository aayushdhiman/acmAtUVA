import java.util.Scanner;
public class FortuneTeller {
	public static void main(String arg[]) {
		
		Scanner scan = new Scanner(System.in);
		int tests = scan.nextInt();
	/*	
		for(int i = 0; i < tests; i++) {
	
			String prediction = scan.nextLine();
			String realTemp = scan.nextLine();
			
			String[] pred1 = prediction.split(" ");
			String[] real1 = realTemp.split(" ");
			
			int correct = 0;
			
			for(int j = 0; j < pred1.length; j++) {
				if(pred1[j].equals(real1[j])) {
					correct++;
				}
			}
			
			if(correct < 5) {
				System.out.println("Fraud");
			}
			else if(correct > 7) {
				System.out.println("Oracle");
			}
			else {
				System.out.println("Draw");
			}
		}
		
		*/
		
		int[] pred = new int [10];
		int[] real = new int [10];
		
		for(int k = 0; k < tests; k++) {
		for(int i = 0; i < 10; i++) {
						int pre = scan.nextInt();
						pred[i] = pre; 
			}
		
		
		for(int i = 0; i < 10; i++) {
			
						int re = scan.nextInt();
						real[i] = re; 
			}
		}

		
	for(int i = 0; i < pred.length; i++) {
		for(int j = 0; j < pred[0].length; j++) {
		System.out.print(pred[i]);
	}
		System.out.print("\n");
	}
	for(int i = 0; i < pred.length; i++) {
		int countRight = 0;
			if(pred[i] == real[i]) {
				countRight++;
			}
		if(countRight < 5) {
			System.out.println("Fraud");
		}
		else if(countRight > 7) {
			System.out.println("Oracle");
		}
		else {
			System.out.println("Draw");
		}
		}
	}
	
}

