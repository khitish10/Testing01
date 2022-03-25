package prac;

public class LinkedList {
	
	Node head;
	public void insert(int data) {
		Node n1=new Node();
		n1.data=data;
		if(head == null) {
			head=n1;
		}
		else {
			Node new_n1=head;
			while(new_n1.next != null) {
				new_n1=new_n1.next;
			}
			new_n1.next=n1;
		}
	}
	public void show() {
		Node n2= head;
		while(n2.next != null) {
			System.out.println(n2.data);
			n2=n2.next;
		}
		System.out.println(n2.data);
	}

}
