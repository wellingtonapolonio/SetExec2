package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> A = new HashSet<>();
		Set<Integer> B = new HashSet<>();
		Set<Integer> C = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int x = sc.nextInt();
		
		for (int i=0; i < x; i++) {
			int y = sc.nextInt();
			A.add(y);
		}
		
		System.out.print("How many students for course B? ");
		 x = sc.nextInt();
		 
		 for (int i=0; i < x; i++) {
				int y = sc.nextInt();
				B.add(y);
			}
		 
		 System.out.print("How many students for course C? ");
		 x = sc.nextInt();
		 
		 for (int i=0; i < x; i++) {
				int y = sc.nextInt();
				C.add(y);
			}
		 
		 Set<Integer>t = new HashSet<>(A);
		 t.addAll(B);
		 t.addAll(C);
		 
		 System.out.print("Total students:"+ t.size());
		 
		 sc.close();
		 
		

	}

}
