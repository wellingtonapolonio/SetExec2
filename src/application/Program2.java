package application;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class Program2 {

	public static void main(String[] args) {
		Set<Integer> A = new HashSet<>();
		Set<Integer> B = new HashSet<>();
		Set<Integer> C = new HashSet<>();
		
		String aux = JOptionPane.showInputDialog("How many students for course A?");
		int x = Integer.parseInt(aux);
		
		for (int i=0; i < x; i++) {
			 aux = JOptionPane.showInputDialog("How many students for course A?");
			int y = Integer.parseInt(aux);
			A.add(y);
		}
		
		aux = JOptionPane.showInputDialog("How many students for course B?");
		
		x = Integer.parseInt(aux);
		
		 
		 for (int i=0; i < x; i++) {
			 aux = JOptionPane.showInputDialog("How many students for course B?");
				
				int y = Integer.parseInt(aux);
				B.add(y);
			}
		 
		 aux = JOptionPane.showInputDialog("How many students for course C?");
		
		 x = Integer.parseInt(aux);
		 
		 for (int i=0; i < x; i++) {
			 aux = JOptionPane.showInputDialog("How many students for course C?");
				int y = Integer.parseInt(aux);
				C.add(y);
			}
		 
		 Set<Integer>t = new HashSet<>(A);
		 t.addAll(B);
		 t.addAll(C);
		 
		 JOptionPane.showMessageDialog(null, "Total students:"+ t.size());
		 
		 System.exit(0);

	}

}
