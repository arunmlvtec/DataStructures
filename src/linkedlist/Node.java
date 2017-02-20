package linkedlist;

public class Node {
	int num;
	Node link;
	public Node(){
		num = 0;
		link = null;
	}
	public Node(int num, Node link){
		this.num = num;
		this.link = link;
	}
	public void setNum(int num){
		this.num = num;
	}
	public void setLink(Node link){
		this.link = link;
	}
	public int getNum(){
		return num;
	}
	public Node getLink(){
		System.out.println("");
		return link;
	}
}