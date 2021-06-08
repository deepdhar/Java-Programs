package Hashing;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

class MyHash {
	int BUCKET;
	ArrayList<LinkedList<Integer>> table;
	MyHash(int b) {
		BUCKET = b;
		table = new ArrayList<LinkedList<Integer>>();
		
		//Initializing arraylist with null linked-lists
		for(int i=0; i<BUCKET; i++)
			table.add(new LinkedList<Integer>());
	}
	
	void insert(int key) {
		int i = key%BUCKET;		//hash function
		table.get(i).add(key);
	}
	
	void remove(int key) {
		int i = key%BUCKET;
		table.get(i).remove((Integer)key);
	}
	
	boolean search(int key) {
		int i = key%BUCKET;
		return table.get(i).contains(key);
	}
}

public class Chaining {
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter bucket size: ");
		int b = scan.nextInt();
		int key;
		
		MyHash hash = new MyHash(b);
		
		System.out.println("Choose the following operations:");
		while(true) {
			System.out.println("\n1.Insert\n2.Delete\n3.Search\n4.Exit");
			System.out.print("Enter your choice: ");
			int ch = scan.nextInt();
			
			switch(ch) {
			case 1:
				System.out.print("Enter key to insert: ");
				key = scan.nextInt();
				hash.insert(key);
				break;
			
			case 2:
				System.out.print("Enter key to delete: ");
				key = scan.nextInt();
				hash.remove(key);
				break;
				
			case 3:
				System.out.print("Enter key to search: ");
				key = scan.nextInt();
				if(hash.search(key))
					System.out.println("Element found");
				else
					System.out.println("Element not found");
				break;
				
			case 4:
				System.exit(1);
				
			default:
				System.out.println("Enter valid choice!");
			}
		}
	}

}
