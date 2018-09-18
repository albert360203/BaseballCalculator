import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		String name;
		System.out.println("Please enter the player's name: ");
		name = stdin.nextLine();
		
		int AB;
		int H;
		int _2B;
		int _3B;
		int HR;
		int R;
		int BB;
		int HBP;
		int SF;
		
		System.out.println("Please enter the following datas of the player in order:\n"
				+ "AB H 2B 3B HR R BB HBP SF");
		AB  = stdin.nextInt();
		H   = stdin.nextInt();
		_2B = stdin.nextInt();
		_3B = stdin.nextInt();
		HR  = stdin.nextInt();
		R   = stdin.nextInt();
		BB  = stdin.nextInt();
		HBP   = stdin.nextInt();
		SF  = stdin.nextInt();
		
		BaseballPlayer p1 = new BaseballPlayer(name,AB,H,_2B,_3B,HR,R,BB,HBP,SF);

		System.out.printf("%s's BA is: %f\n",p1.getPlayerName(),p1.CalculateBA());
		System.out.printf("%s's OBP is: %f\n",p1.getPlayerName(),p1.CalculateOBP());
		System.out.printf("%s's SLG is: %f\n",p1.getPlayerName(),p1.CalculateSLG());
		System.out.printf("%s's OBS is: %f\n",p1.getPlayerName(),p1.CalculateOBS());
		System.out.printf("%s's TB is: %d\n",p1.getPlayerName(),p1.CalculateTB());
		
		//8399
		//2873
		//506
		//136
		//714
		//2174
		//2062
		//43
		//0
	}

}
