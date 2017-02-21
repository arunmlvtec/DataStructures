/**
 * Test Singly Linked List
 * Description: Main method to test Singly Linked List implementation
 * 
 * Created By: Arun Pokharna
 * 
 * */
package linkedlist;

import java.util.Scanner;

public class LinkedListTest {
/**
 *  				1). isEmpty()
 * 					2). getSize()
 * 					3). insertAtFirst(int num)
 * 					4). insertAtLast(int num)
 * 					5). insertAtPosition(int num, int position)
 *	 				6). deleteFirstElement()
 * 					7). deleteLastElement()
 * 					8). deleteElementAtPosition(int position)
 * 					9). display()
 * */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedList list = new LinkedList();
		int position = 0;
		char ch = ' ';
		do {
			System.out.println("Linked List Operations");
			System.out.println("1). Insert at Start");
			System.out.println("2). Insert at End");
			System.out.println("3). Insert Element at Nth Position");
			System.out.println("4). Check Empty List");
			System.out.println("5). Get the Size of List");
			System.out.println("6). Delete 1st element of List");
			System.out.println("7). Delete Last element of List");
			System.out.println("8). Delete Nth Element from the List");
			System.out.println("9). Display Linked List");
			
			int choice = s.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter an element to add in the Linked List");
					list.insertAtFirst(s.nextInt());
					break;
					
				case 2:
					System.out.println("Enter an element to add in the Linked List");
					list.insertAtLast(s.nextInt());
					break;
					
				case 3:
					System.out.println("Enter an element to add in the Linked List");
					int num = s.nextInt();
					System.out.println("Enter position of the element to add in the Linked List");
					position = s.nextInt();
					if (position <= list.getSize() && position > 0)
						list.insertAtPosition(num, position);
					else
						System.out.println("Invalid index");
					break;
					
				case 4:
					System.out.print("List Status: ");
					if (list.isEmpty())
						System.out.println("Empty.");
					else
						System.out.println("Not Empty.");
					break;
					
				case 5:
					System.out.println("List size is: " + list.getSize());
					break;
					
				case 6:
					System.out.println("Deleted first element from the Linked List is: " + list.deleteFirstElement());
					break;
					
				case 7:
					System.out.println("Deleted last element from the Linked List is: " + list.deleteLastElement());
					break;
					
				case 8:
					System.out.println("Enter index of the element to delete from the Linked List");
					position = s.nextInt();
					if (position > 0 && position <= list.getSize())
						System.out.println("Deleted last element from the Linked List is: " + list.deleteElementAtPosition(position));
					else
						System.out.println("Invalid Index Entered!");
					break;
					
				case 9:
					System.out.println("Elements of Linked List are: ");
					list.display();
					break;
					
				default:
					System.out.println("Invalid Entry, Please choose  one of the above options...");
					break;
			}
			System.out.println("Press Y/y, to continue with Linked List operations...");
			ch = s.next().charAt(0);
		}
		while(ch == 'Y' || ch == 'y');
		s.close();
	}
}
