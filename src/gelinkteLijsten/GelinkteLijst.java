package gelinkteLijsten;

public class GelinkteLijst {

	/**
	 * Alleen de gelinkte lijst heeft toegang tot de node
	 */
	private class Node {
		// Dit is de data die je opslaat
		Object data;

		// referenties/pijlen naar de vorige en volgende nodes
		Node next, previous;
		
		  @Override public String toString() {
			  if (data == null){
				  return "";
			  } else {
				  return data.toString();
			  }
			  
		  }
	}

	private Node first, last;
	private int size;

	public GelinkteLijst() {
		size = 0;
	}

	Node getFirst() {
		return first;
	}

	Node getLast() {
		return last;
	}

	/**
	 * Voeg toe aan de voorkant
	 */
	void insertFirst(Object o) {
		Node n = new Node(); // nieuwe node
		n.data = o; // vul de node met data
		n.next = first; // maak duidelijk waar je in de rij zit
//		if(first != null) first.next = n;
		first = n; // plaats de node aan het begin
		size++;
	}

	/**
	 * Voeg toe aan de achterkant
	 */
	void insertLast(Object o){
		Node n = new Node();
		n.data = o;
		n.previous = last;
		last = n;
		size++;
	}

	/**
	 * Voeg toe voor een ander element
	 */
	void insertBefore(Object o, Object before) {
		Node n = new Node();
		n.data = o;
		Node pointer = first;
		while (pointer.data == before) {
			if (isLast(pointer)) return;
			pointer = pointer.next;
		}
		n.next = pointer;
		n.previous = pointer.previous;
		Node temp = pointer.previous;
		temp.next = n;
		pointer.previous = n;
		size++;
	}

	/**
	 * Voeg toe na een ander element
	 */
	void insertAfter(Object o, Object after) {
		Node n = new Node();
		n.data = o;
		Node pointer = first;
		while (!pointer.data.equals(after)) {
			if (isLast(pointer)) return;
			pointer = pointer.next;
		}
		n.next = pointer.next;
		n.previous = pointer;
		pointer.next.previous = n;
		pointer.next = n;
		size++;
	}

	/**
	 * Verwijder een element
	 * 
	 * @param data
	 */
	void remove(Object data) {
		Node pointer = first;
		while (!pointer.data.equals(data)) {
			if (isLast(pointer)) return;
			pointer = pointer.next;
		}
		pointer.previous.next = pointer.next;
		pointer.next.previous = pointer.previous;
		size--;
	}

	/**
	 * 
	 * @param current
	 * @return
	 */
	boolean isFirst(Node current) {
		if (current.equals(first)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 
	 * @param current
	 * @return
	 */
	boolean isLast(Node current) {
		if (current.equals(last)) {
			return true;
		} else {
			return false;
		}
	}

	  @Override public String toString() {
		    StringBuilder result = new StringBuilder();
		    String nl = System.getProperty("line.separator");

		    result.append("Deze lijst bestaat uit "+size+" onderdelen." + nl);
		    Node pointer = first;
		    while (pointer != null){
		    	if (pointer.previous != null) result.append("previous: "+pointer.previous.toString()+" - ");
		    	result.append("current: "+pointer.toString());
		    	if (pointer.next != null) result.append(" - next: "+pointer.next.toString());
		    	result.append(nl);
		    	pointer = pointer.next;
		    }
		    return result.toString();
		  }
	
	/**
	 * Het aantal elementen in de gelinkte lijst
	 * 
	 * @return
	 */
	int getSize() {
		return size;
	}	
}
