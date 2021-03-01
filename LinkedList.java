package data_structures;

// the only import statement you are allowed.
import java.util.Iterator;
import java.util.NoSuchElementException;
// do not import anything else.


/**
 * @author istus
 *	LinkedList.java contains all the methods specified below. These methods carry out
 *	basic functions that deal with the linked list.
 * @param <E>
 */
public class LinkedList<E> implements ListI<E> {

	/**
	 * @author istus
	 *	Constructor
	 * @param <E>
	 */
	public class Node<E> {
		Node<E> next;
		E data;
		public Node(E obj) {
			data = obj;
			next = null;
		}
	}

	private Node<E> head;
	private Node<E> tail;	
	private int currentSize;		

	@Override
	public void addFirst(E obj) {
		Node<E> newNode = new Node<E>(obj);
		newNode.next = head;
		head = newNode;
		currentSize++;
	}

	@Override
	public void addLast(E obj) {
		Node<E> newNode = new Node<E>(obj);
		if (head == null) {			
			head = tail = newNode;
			currentSize++;
			return;
		}
		tail.next = newNode;
		tail = newNode;
		currentSize++;
	}

	@Override
	public E removeFirst() {
		if (head == null) {
			return null;
		}
		E tmp = head.data;
		if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
			currentSize--;
		}
		return tmp;
	}

	@Override
	public E removeLast() {
		if (head == null)
			return null;
		if (head == tail)
			return removeFirst();
		Node<E> current = head;
		Node<E> previous = null;
		while (current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		tail = previous;
		currentSize--;		
		return current.data;		
	}

	@Override
	public E peekFirst() {
		if (tail == null) {
			return null;
		}
		return tail.data;
	}

	@Override
	public E peekLast() {
		if (head == null) {
			return null;
		}
		Node<E> index = head;
		while (index.next!= null) {
			index = index.next;
		}
		return index.data;
	}

	@Override
	public void makeEmpty() {
		head = tail = null;
		currentSize = 0;
	}

	@Override
	public boolean isEmpty() {		
		return (head == null);
	}

	@Override
	public boolean isFull() {		
		return false;
	}

	@Override
	public int size() {
		return currentSize;
	}

	@Override
	public boolean contains(E obj) {
		Node <E> tmp = head;
		while (tmp != null) {
			if (((Comparable<E>)tmp.data).compareTo(obj)==0) 
				return true;
			tmp = tmp.next;			
		}
		return false;
	}

	@Override
	public Iterator<E> iterator() {		
		return new Iteratorhelper();		
	}

	class Iteratorhelper implements Iterator<E> {
		Node<E> index;	
		Node<E> tmp;
		public Iteratorhelper() {
			index = head;
		}

		public boolean hasNext() {
			return index != null;
		}

		public E next() {
			if (!hasNext()) 
				throw new NoSuchElementException();
			E tmp = index.data;		
			index = index.next;						
			return tmp;
		}		
	}
}
