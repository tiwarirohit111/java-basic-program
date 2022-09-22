package codingblock;

import java.util.Scanner;

public class fuction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if(marks <= 100 && marks >60) {
			System.out.println("beta pass ho gya ");
		}else if (marks <= 60 && marks >40){
			System.out.println("fail ho gya ");
		}else
			System.out.println("galat no h");
		}
		
	}

