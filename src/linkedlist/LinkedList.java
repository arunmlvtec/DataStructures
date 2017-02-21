/**
 * Integer Linked List (Singly Linked List) Implementation
 * Description: Linked List is implemented in Java for integer values.
 * 				Methods created in this class:
 *	 				1). isEmpty()
 * 					2). getSize()
 * 					3). insertAtFirst(int num)
 * 					4). insertAtLast(int num)
 * 					5). insertAtPosition(int num, int position)
 *	 				6). deleteFirstElement()
 * 					7). deleteLastElement()
 * 					8). deleteElementAtPosition(int position)
 * 					9). display()
 * 
 * Created By: Arun Pokharna
 * 
 * */

package linkedlist;

public class LinkedList {
	protected Node begin;
	protected Node end;
	public int size;
	
	/** Default constructor to initialize class variables*/
	public LinkedList(){
		begin = null;
		end = null;
		size = 0;
	}
	
	/** returns true if the list is empty. */
	public boolean isEmpty(){
		return size == 0;
		//return start == null;
	}
	
	/** returns integer value which is the size of the linked list.*/
	public int getSize(){
		return size;
	}
	
	/** Insert the num value at the beginning of the linked list*/
	public void insertAtFirst(int num){
		Node node = new Node(num, null);
		size += 1;
		if(begin == null){
			begin = node;
			end = node;
		}
		else{
			node.setLink(begin);
			begin = node;
		}
	}
	
	/**Insert the num value at the end of the linked list.*/
	public void insertAtLast(int num){
		Node node = new Node(num, null);
		size += 1;
		if(begin == null){
			begin = node;
			end = node;
		}
		else{
			end.setLink(node);
			end = node;
		}
	}
	
	/** Insert the num value at the position index in the linked list.*/
	public void insertAtPosition(int num, int position){
		Node node = new Node(num, null);
		Node ptr = begin;
		position -= 1;
		for (int i = 0; i < size; i++){
			if (i == position){
				Node temp = ptr.getLink();
				ptr.setLink(node);
				node.setLink(temp);
				break;
			}
			ptr = ptr.getLink();
		}
		size += 1;
	}
	
	/** Removes and returns the first element of the linked list*/
	public int deleteFirstElement(){
		int num = -1;
		if(size > 0){
			num = begin.getNum();
			begin = begin.getLink();
			size--;
		}
		return num;
	}
	
	/** Removes and returns the last element of the linked list*/
	public int deleteLastElement(){
		int num = -1;
		if (begin != null){
			if(begin.getLink() == null){
				num = begin.getNum();
				begin = null;
				return num;
			}
			else{
				Node node = begin;
				while(node.link.link != null)
					node = node.getLink();
				num = node.getNum();
				node.setLink(null);
			}
		}
		return num;
	}
	
	/** Removes and returns num value from the position index from the linked list.*/
	public int deleteElementAtPosition(int position){
		int num = -1;
		if (position > 0 && position <= size){
			if (position == 1){
				num = begin.getNum();
				begin = begin.getLink();
				size -= 1;
			}
			else if(position == size){
				Node node = begin;
				while(node.link.link != null)
					node = node.getLink();
				num = node.getNum();
				node.setLink(null);
			}
			else{
				Node node = begin;
				for(int i = 1; i < size; i++){
					if(i == position - 1){
						Node temp = node.getLink();
						num = temp.getNum();
						temp = temp.getLink();
						node.setLink(temp);
						break;
					}
					node = node.getLink();
				}
			}
		}
		return num;
	}
	
	/** Displays all the elements of the linked list*/
	public void display(){
		if(size > 0){
			Node node = begin;
			while(node.getLink() != null){
				System.out.println(node.getNum());
				node = node.getLink();
			}
			System.out.println(node.getNum());
		}
	}
}


