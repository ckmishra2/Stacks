package datastack;

// create  a Stack of 56->30->70
//peak and pop from the stack till it is empty
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
	void pop() {
		if( top==null) {
		System.out.println("Stack is empty");
		return;
		}
		top=top.next;
		
	}
	int peak() {
		if(top==null) {
			System.out.println("stack is empty");
			return-1;	
		}
		return top.data;
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
		p.peak();
		p.pop();
		p.pop();
		p.pop();
		p.printstack();
		System.out.println("stack is empty");
	}
}