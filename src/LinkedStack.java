public class LinkedStack<T> implements StackADT<T> {
	private Node<T> top;

	public LinkedStack() {
		this.top = null;
	}

	@Override
	public void push(T newEntry) {
		Node<T> toAdd = new Node<>(newEntry, top);
		top = toAdd;
	}

	@Override
	public T pop() {
		if (top == null)
			return null;

		T popped = top.data;
		top = top.next;
		return popped;
	}

	@Override
	public T peek() {
		if (top == null)
			return null;
		return top.data;
	}

	@Override
	public boolean isEmpty() {
		return top == null;
	}

	@Override
	public void clear() {
		top = null;

	}

	private static class Node<T> {

		// all fields are visible to the outer class
		private T data; // entry in bag
		private Node<T> next; // link to next node

		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}

	} // end Node<T> class
}
