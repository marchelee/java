import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// Create and initialize a queue using LinkedList
		Queue<String> names = new LinkedList<>();
		
		// add() to perform enqueue operation
		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");
		names.add("E");
		
		System.out.println("Queue: " + names);
		System.out.println();
		
		// remove() to perform dequeue operation
		String name = names.remove();
		
		System.out.println("Dequeue: " + name);
		System.out.println("Queue: " + names);
		System.out.println();
		
		// poll() has the same function like remove()
		name = names.remove();
		
		System.out.println("Dequeue: " + name);
		System.out.println("Queue: " + names);
		System.out.println();
		
		// remove() returns NoSuchElementException if queue is empty
		// poll() returns null if queue is empty
		
		// isEmpty() to check if queue is empty or not
		System.out.println("Is Empty? " + names.isEmpty());
		System.out.println();
		
		// size() to find the size of queue
		System.out.println(names.size());
		System.out.println();
		
		// search() to find the queue contains an element
		if(names.contains("E")) {
			System.out.println("The queue contains E");
		} else {
			System.out.println("No such element found");
		}
		
		// get element in front of the queue without removing it by using
		// element() returns NoSuchElementException when queue is empty
		String firstPersonElement = names.element();
		System.out.println("First person waiting in queue: " + firstPersonElement);
		
		// peek() return null if queue is empty
		String firstPersonPeek = names.peek();
		System.out.println("First person waiting in queue: " + firstPersonPeek);
		
		System.out.println();
		
		// Iterating queue
		// forEach 
		names.forEach(n -> {
			System.out.println(n);
		});
		System.out.println();
		
		// iterator()
		Iterator<String> namesIterator = names.iterator();
		while(namesIterator.hasNext()) {
			String nameIterator = namesIterator.next();
			System.out.println(nameIterator);
		}
		System.out.println();
		
		// simple for-each
		for(String n: names) {
			System.out.println(n);
		}
	}

}
