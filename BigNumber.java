package big_numbers;

import data_structures.LinkedList;

// This is where you will write your code for manipulating the big number
// as described in the assignment. 
//
// This class will include the getFirstDigit(), getLastDigit(), addFirstDigit(), addLastDigit()
// methods, as well as the setNegative(), getNegative(), length() methods.
//
// You will also need to write stringToBigNumber() and toString() methods.

//For the LinkedList.java class I barely wrote javadoc comments because all of the comments
//are on the ListI.java class, so I didn't want to basically copy and paste everything.
//seems repetitive. 

public class BigNumber {

	LinkedList<Integer> list = new LinkedList<Integer>();

	/**
	 * @return first digit of the linked list
	 */
	public Integer getFirstDigit() {
		return list.removeFirst();		
	}

	/**
	 * @return last digit of the linked list
	 */
	public Integer getLastDigit() {
		return list.removeLast();		
	}

	/**
	 * @adds an element to beginning of linked list
	 */
	public void addFirstDigit() {
		list.addFirst();		
	}

	/**
	 * @adds an element to end of linked list
	 */
	public void addLastDigit() {
		list.addLast();		
	}

	/**
	 * @param b
	 */
	public void setNegative(boolean b) {
		return;
	}

	/**
	 * @return
	 */
	public boolean getNegative() {
		return false;
	}

	/**
	 * @return size of linked list
	 */
	public int length() {
		return list.size();
	}

	/**
	 * @param s
	 */
	public void stringToBigNumber(String s) {

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return null;
	}

}
