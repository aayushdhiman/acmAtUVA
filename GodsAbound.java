import java.util.HashMap;
import java.util.Map;
import java.util.*;


public class GodsAbound {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		int totalCases = b.nextInt();
		for(int z = 0; z < totalCases; z++) {
		String[] cases = in.nextLine().split(" ");
		
		int named = Integer.parseInt(cases[0]);
		int def = Integer.parseInt(cases[1]);
		
		ArrayList<String[]> names = new ArrayList<String[]>();
//		String[] names = new String[named * 3];
		Map<String, String> map = new HashMap<String, String>();
		
		for(int i = 0; i < named; i++) {
			names.add(in.nextLine().split(" "));
			
		}
		
		for(int i = 0; i < names.size(); i++) {
			map.put(names.get(i)[0], names.get(i)[1]);
		}
		
		
		ArrayList<String> missing = new ArrayList<String>();
		for(int i = 0; i < def; i++) {
			String temp = in.nextLine();
			missing.add(temp);
		}
		
		for(int i = 0; i < missing.size(); i++) {
			System.out.println(map.get(missing.get(i)));
		}
		
		}
		
//		for(int  b = 0; b < totalCases; b++) {
//		int cases = in.nextInt();
//		int que = in.nextInt();
//		String[] names = new String[cases];
//		String[] roles = new String[cases];
//		
//		for(int i = 0; i < names.length; i++) {
//			for(int j = 0; j < 2; j++) {
//				if(j == 0) {
//					names[i] = in.nextLine();
//				}
//				if(j == 1) {
//					roles[i] = in.nextLine();
//				}
//			}
//		}
//		String[] gods = new String[que];
//		
//		for(int i = 0; i < que; i++) {
//			String god = in.nextLine();
//			gods[i] = god; 
//		}
//		
//		
//		for(int i = 0; i < que; i++) {
//			for(int j = 0; j < cases; j++) {
//			if(gods[i] == names[j]) {
//				System.out.println(roles[j]);
//			}
//			}
//		}
//		}
//		
//		
//		/*String[] nums = in.nextLine().split(" ");
//		Map<String, String> namesMap = new HashMap<String, String>();
//		
//		for(int i = 0; i < Integer.parseInt(nums[i]); i++) {
//			String[] names = in.nextLine().split(" ");
//			namesMap.put(names[0], names[1]);
//		}
//		
//		String[] keys = new String[Integer.parseInt(nums[1])]; 
//		for(int i = 0; i < Integer.parseInt(nums[1]); i++) {
//			keys[i] = in.nextLine();
//		}
//		
//		
//		for(int i = 0; i < keys.length; i++) {
//			System.out.println(namesMap.get(keys[i]));	*/		
		}

	}



