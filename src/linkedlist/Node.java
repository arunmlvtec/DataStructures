/**
 * Implementation of Integer Node for Singly Linked List
 * Description: Node for Singly Linked List in Java.
 * 				Methods created in this class:
 *	 				1). setNum(int num)
 * 					2). setLink(Node link)
 * 					3). getNum()
 * 					4). getLink()
 * 
 * Created By: Arun Pokharna
 * 
 * */
package linkedlist;

public class Node {
	int num;
	Node link;
	
	/** Default Constructor*/
	public Node(){
		num = 0;
		link = null;
	}
	
	/** Parameterized Constructor*/
	public Node(int num, Node link){
		this.num = num;
		this.link = link;
	}
	
	/** Set the node value to num*/
	public void setNum(int num){
		this.num = num;
	}
	
	/** Set the node link to link which is next node*/
	public void setLink(Node link){
		this.link = link;
	}
	
	/** Return the node value num*/
	public int getNum(){
		return num;
	}
	
	/** Return the next node link*/
	public Node getLink(){
		return link;
	}

}