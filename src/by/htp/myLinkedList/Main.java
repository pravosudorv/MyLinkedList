package by.htp.myLinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList<A> list = new LinkedList<A>();
		
		list.add(new A(1));
		list.add(new A(2));
		list.add(new A(3));
		list.add(new A(4));
		list.add(new A(5));
		
		
		list.add(2, new A(99));
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		
		A del = new A(99);
		list.remove(del);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
	}
}
