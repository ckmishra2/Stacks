package datastack;



class Node{
	Node next;
	int data;
Node(int value){
	this.data = value;
	this.next=null;
}	
}
public class Stack{
	Node top;
Stack(){
	top=null;
}	
	void push(int value) {
		Node n = new Node(value);
		n.next=top;
		top=n;
	}
	void printstack() {
		Node temp = this.top;
		while (temp != null) {
			System.out.println(temp.data );
			temp = temp.next;
		
	}
}
	public static void main(String[] args) {
		Stack p = new Stack();
		p.push(70);
		p.push(30);
		p.push(56);
		p.printstack();
	}
}