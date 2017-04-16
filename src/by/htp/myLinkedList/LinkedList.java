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
			Node<E> temp;
			
			if (size != 0) {
				temp = new Node(last, element, null);
				last.next = temp;
				last = temp;
				size++;
			} else {
				temp = new Node(null, element, null);
				first = temp;
				last = temp;
				size++;
			}
		}
	}
	
	public void add(int index, E element) {
		Node<E> actual = getNode(index);
		Node<E> prev = actual.prev;
		
		if(actual != null) {
			Node<E> temp = new Node(prev, element, actual);
			prev.next = temp;
			actual.prev = temp;
			size++;
		}
	}

	public void addFirst(E element) {
		if (element != null) {
			Node<E> temp = new Node(null, element, first);
			first = temp;
			size++;
		}
	}

	public E get(int index) throws IndexOutOfBoundsException {
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		Node<E> cell = getNode(index);
		if(cell != null) {
			return cell.item;
		} else {
		return null;
		}
	}
	
	private Node getNode(int index) {
		Node<E> temp = null;
		if (index < size) {
			
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
		}
		return temp;
	}
	

	public int getsize() {
		return size;
	}
	
	public E remove(int index) throws IndexOutOfBoundsException{
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		Node<E> actual = getNode(index);
		actual.prev.next = actual.next;
		actual.next.prev = actual.prev;
		size--;
		return actual.item;
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
