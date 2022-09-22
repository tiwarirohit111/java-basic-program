import java.util.Scanner;

public class condition2 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	double marks = scn.nextDouble();
	if(marks >= 300) {
		System.out.println("first ");
	}else if(marks <300) {
		System.out.println("try next time");
	}else {
		System.out.println("galti bta rha h");
	}
	
	
}
}
