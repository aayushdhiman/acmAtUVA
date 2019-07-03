import java.util.Scanner;

public class TargetPractice {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int testCases = in.nextInt();
		in.nextLine();
		float[] ans = new float[testCases];
		
		for(int i = 0; i < ans.length; i++) {
			String[] input = in.nextLine().split(" ");
			
			float vi = Float.parseFloat(input[0]);
			float angle = Float.parseFloat(input[1]);
			float xTarget = Float.parseFloat(input[2]);
			
			float vy = (float) (vi * Math.sin(angle));
			float vx = (float) (vi * Math.cos(angle));
			float time = (float) (xTarget/vx);
			
			float yTarget = (float) (vy * time - (.5) * (9.8) * (Math.pow(time, 2)));			
			ans[i] = yTarget;
		}
		
		for(int i = 0; i < ans.length; i++) {
			String answer = ans[i] + "";
//			System.out.println(answer.substring(answer.indexOf("."), answer.indexOf(".") + 3));
//			System.out.println(ans[i]);
//			float answer = (int) (ans[i] * 1000);
//			float realAns = answer/1000;
//			System.out.println(realAns);
//			2
//			101
//			10 0.78539816339 2
			
//			System.out.println("answer: " + answer + " answer.length" + answer.length());
			if(answer.length() > 4) {
				System.out.printf("%.3f%n", ans[i]);				
			}else {
				System.out.println(ans[i]);
			}
			
			
			
		}
		
		

	}

}
