package Arrays;

import java.util.*;

public class ArrayListProgram {
	
	static void search(ArrayList<Integer> al) {
		for(int i: al) {
			if(i==60)
				System.out.println(i);
		}
	}
	
	public static void main(String args[]) {
		//dynamic sized array
		ArrayList<Integer> al = new ArrayList<Integer> ();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		
		search(al);
	}

}
