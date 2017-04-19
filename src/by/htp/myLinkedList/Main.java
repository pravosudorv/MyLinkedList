package by.htp.myLinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList<A> list = new LinkedList<A>();
		
		list.add(new A(1));
		list.add(new A(2));
		list.add(new A(3));
		list.add(new A(4));
		list.add(new A(5));
		
		print(list);
		
		list.add(2, new A(99));
		
		print(list);
	
		A del = new A(99);
		list.remove(del);
		
		print(list);
		
		LinkedList<A> list2 = new LinkedList<A>();
		
		list2.add(new A(55));
		list2.add(new A(66));
		list2.add(new A(77));
		
		list.addLinkedLIst(2, list2);
		
		print(list);
	}
	
	public static void print(LinkedList<A> list) {
		A i = list.iteratorInstalFirst();
		while(i != null) {
			System.out.print(" ["+i + "] ");
			i = list.iteratorNext();
		}
		System.out.println();
	}
}
