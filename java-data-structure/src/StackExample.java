import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

// LIFO data structure
public class StackExample {
	public static void main(String[] args) {
		Stack<String> names = new Stack<>();
		
		// push() to insert object 
		names.push("A");
		names.push("B");
		names.push("C");
		names.push("D");
		names.push("E");
		
		System.out.println(names);
		System.out.println();
		
		// pop() to take out the object
		System.out.println(names.pop());
		System.out.println(names);
		System.out.println();
		
		// peek() to see the item on the top of the stack
		System.out.println(names.peek());
		System.out.println(names);
		System.out.println();
		
		// isEmpty() to check if stack is empty
		System.out.println("Is Empty? " + names.isEmpty());
		System.out.println();
		
		// size() to find the size of the stack
		System.out.println("Size: " + names.size());
		System.out.println();
		
		// search() to search for an element
		// returns 1-based position of the element from the top of the stack
		// -1 means not found
		
		System.out.println(names);
		System.out.println();
		
		int position_B = names.search("B");
		int position_E = names.search("E");
		
		if(position_B != -1) {
			System.out.println("Position B: " + position_B);
			System.out.println();
		} else {
			System.out.println("Not Found");
			System.out.println();
		}
		
		if(position_E != -1) {
			System.out.println("Position E: " + position_E);
			System.out.println();
		} else {
			System.out.println("Not Found");
			System.out.println();
		}
		
		// Iteration
		// forEach()
		names.forEach(name -> {
			System.out.println(name);
		});
		System.out.println();
		
		// iterator()
		Iterator<String> nameIterator = names.iterator();
		while(nameIterator.hasNext()) {
			String name = nameIterator.next();
			System.out.println(name);
		}
		System.out.println();
		
		// forEachRemaining()
		nameIterator = names.iterator();
		nameIterator.forEachRemaining(name -> {
			System.out.println(name);
		});
		System.out.println();
		
		// iterate a stack from TOP or BOTTOM using listIterator()
		ListIterator<String> namesListIterator = names.listIterator(names.size());
		System.out.println("TOP to BOTTOM");
		while(namesListIterator.hasPrevious()) {
			String name = namesListIterator.previous();
			System.out.println(name);
		}
		System.out.println();
		
		System.out.println("BOTTOM to TOP");
		while(namesListIterator.hasNext()) {
			String name = namesListIterator.next();
			System.out.println(name);
		}
		System.out.println();
	}
}
