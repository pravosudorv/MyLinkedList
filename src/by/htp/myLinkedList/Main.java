package by.htp.myLinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList<A> list = new LinkedList<A>();
		
		list.add(new A(1));
		list.add(new A(2));
		list.add(new A(3));
		list.add(new A(4));
		list.add(new A(5));
		System.out.println(list.get(3));
	}
}
