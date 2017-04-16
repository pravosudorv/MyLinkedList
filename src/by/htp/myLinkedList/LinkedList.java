package by.htp.myLinkedList;

import java.util.Collection;

public class LinkedList<E> {

	private int size;
	Node<E> first;
	Node<E> last;

	public LinkedList() {
	}

	public LinkedList(Collection<? extends E> c) {
		this();
	}

	public void add(E element) {
		if (element != null) {
			if (size != 0) {
				Node<E> temp = new Node(last, element, null);
				last.next = temp;
				last = temp;
				size++;
			} else {
				Node<E> temp = new Node(null, element, null);
				first = temp;
				last = temp;
				size++;
			}
		}
	}

	public void addFirst(E element) {
		if (element != null) {
			Node<E> temp = new Node(null, element, first);
			first = temp;
			size++;
		}
	}

	public E get(int index) {
		if (index < size) {
			Node<E> temp = null;
			
			if (index < size/2) {
				temp = first;
				for (int i = 0; i < index; i++) {
					temp = temp.next;
				}
				
			} else {
				temp = last;
				for (int i = size - 1; i > index; i--) {
					temp = temp.prev;
				}
			}
			return temp.item;
		}
		return null;
	}

	public int getSize() {
		return size;
	}

	private class Node<E> {
		E item;
		Node<E> next;
		Node<E> prev;

		Node(Node<E> prev, E element, Node<E> next) {
			this.item = element;
			this.prev = prev;
			this.next = next;
		}
	}
}
