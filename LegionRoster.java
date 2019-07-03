import java.util.Scanner;

public class LegionRoster {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int totalLegions = in.nextInt();
		int[] num = new int[totalLegions];
		
		for(int i = 0; i < totalLegions; i++) {
			num[i] = in.nextInt();
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i] * 1500);
		}

	}

}
