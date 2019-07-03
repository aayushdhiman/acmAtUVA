import java.util.Scanner;
import java.util.*;

public class CircuitSorting {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tests = scan.nextInt();
		//scan.nextLine();
		int numPlayers = scan.nextInt();
		List<Player> players = new ArrayList<Player>(numPlayers);
		/*
		 * for(int i = 0; i < numPlayers; i++) {
			String temp = scan.nextLine();
			String[] playerInfo = temp.split(" ");
			
			players.add(new Player(playerInfo[0], Integer.parseInt(playerInfo[1])));
		}
		 */
		
		
		Collections.sort(players);
		for(Player p : players){
			System.out.println(p.getName());
		}
	}
}
