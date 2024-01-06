package p2;

import java.util.Random;
import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random generator = new Random();
		int nr= generator.nextInt(101);
		System.out.println("nr=" +nr);
		
		if (nr == 0)
			nr++;
		
		Scanner t = new Scanner(System.in);
		int x;
		
		System.out.println("Ghiceste numarul (0-100) ");
		do {
			System.out.println("Introdu numarul: ");
			x = t.nextInt();
			
			if(x == 0)
				break;
			if(x < nr)
				System.out.println("Mai mare ");
			if(x > nr)
				System.out.println("Mai mic ");
        	}
		while( x != nr );
		
		if( x == 0)
			System.out.println("Joc intrerupt! ");
		if( x != 0)
			System.out.println("Ai ghicit! ");
		}

}

