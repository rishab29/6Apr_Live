package Lecture19;

public class LinkedList {

	private class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	int size;
	Node head;
	Node tail;

	public LinkedList() {
		// TODO Auto-generated constructor stub
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	public LinkedList(Node head, Node tail, int size) {
		// TODO Auto-generated constructor stub
		this.size = size;
		this.head = head;
		this.tail = tail;
	}

	// 0(1)
	public int size() {
		return this.size;
	}

	// const
	public boolean isEmpty() {
		return this.size() == 0;
	}

	// const
	public void addFirst(int data) {
		Node node = new Node(data, this.head);
		this.head = node;

		if (this.isEmpty()) {
			this.tail = node;
		}

		this.size++;
	}

	// const because of tail
	public void addLast(int data) {
		Node node = new Node(data, null);

		if (this.isEmpty()) {
			this.tail = node;
			this.head = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}

		this.size++;
	}

	// n
	private Node getNodeAt(int idx) throws Exception {
		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}

		int counter = 0;
		Node temp = this.head;

		while (counter < idx) {
			temp = temp.next;
			counter++;
		}

		return temp;
	}

	// n
	public void addAt(int idx, int data) throws Exception {
		if (idx < 0 || idx > this.size) {
			throw new Exception("Invalid Index");
		}

		if (idx == 0) {
			this.addFirst(data);
		} else if (idx == this.size) {
			this.addLast(data);
		} else {
			Node nm1 = this.getNodeAt(idx - 1);
			Node node = new Node(data, nm1.next);
			nm1.next = node;
			this.size++;
		}
	}

	// const
	public int getFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}

		return this.head.data;

	}

	// const
	public int getLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}

		return this.tail.data;

	}

	// n
	public int getAt(int idx) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}

		return this.getNodeAt(idx).data;

	}

	// const
	public int removeFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}

		Node rv = this.head;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
		return rv.data;
	}

	// n
	public int removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}

		Node rv = this.tail;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node temp = this.getNodeAt(this.size - 2);
			temp.next = null;
			this.tail = temp;
		}
		this.size--;
		return rv.data;
	}

	// n
	public int removeAt(int idx) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}

		if (idx < 0 || idx >= this.size) {
			throw new Exception("Invalid Index");
		}

		if (idx == 0) {
			return this.removeFirst();
		} else if (idx == this.size - 1) {
			return this.removeLast();
		} else {
			Node temp = this.getNodeAt(idx - 1);
			Node rv = this.getNodeAt(idx);
			temp.next = temp.next.next;
			this.size--;
			return rv.data;
		}

	}

	// n
	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}

		System.out.println("END");
	}

	public void reverseDI() throws Exception {
		int left = 0, right = this.size - 1;

		while (left <= right) {
			Node l = this.getNodeAt(left);
			Node r = this.getNodeAt(right);

			int temp = l.data;
			l.data = r.data;
			r.data = temp;
			left++;
			right--;
		}
	}

	public void reversePI() {
		Node prev = this.head;
		Node curr = prev.next;
		while (curr != null) {
			Node tprev = prev;
			Node tcurr = curr;

			prev = curr;
			curr = curr.next;

			tcurr.next = tprev;
		}

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	public void reversePR() {
		this.reversePR(this.head);

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	private void reversePR(Node node) {
		if (this.tail == node) {
			return;
		}

		reversePR(node.next);
		node.next.next = node;

	}

	public int mid() {
		return this.getMidNode().data;
	}

	private Node getMidNode() {
		Node slow = this.head;
		Node fast = this.head;

		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}

	public int KthNodeFromEnd(int k) throws Exception {
		if (k <= 0 || k > this.size) {
			throw new Exception("Invalid K");
		}

		Node slow = this.head;
		Node fast = this.head;

		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow.data;
	}

	public void createCycle() throws Exception {
		Node temp = this.getNodeAt(2);
		this.tail.next = temp;
	}

	public boolean detectCycle() {
		Node slow = this.head;
		Node fast = this.head;

		while (slow.next != null && fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				return true;
			}
		}

		return false;

	}

	public LinkedList merge(LinkedList list2) {
		Node temp1 = this.head;
		Node temp2 = list2.head;

		LinkedList ans = new LinkedList();

		while (temp1 != null && temp2 != null) {
			if (temp1.data < temp2.data) {
				ans.addLast(temp1.data);
				temp1 = temp1.next;
			} else {
				ans.addLast(temp2.data);
				temp2 = temp2.next;
			}
		}

		while (temp1 != null) {
			ans.addLast(temp1.data);
			temp1 = temp1.next;
		}

		while (temp2 != null) {
			ans.addLast(temp2.data);
			temp2 = temp2.next;
		}

		return ans;

	}

	public void MergeSort() {
		LinkedList sorted = this.MergeSortHelper();

		this.head = sorted.head;
		this.tail = sorted.tail;
		this.size = sorted.size;
	}

	private LinkedList MergeSortHelper() {
		if (this.size() == 1) {
			return this;
		}

		Node mid = this.getMidNode();
		Node midnext = mid.next;
		mid.next = null;

		LinkedList first = new LinkedList(this.head, mid, (this.size() + 1) / 2);
		LinkedList second = new LinkedList(midnext, this.tail, (this.size()) / 2);

		first = first.MergeSortHelper();
		second = second.MergeSortHelper();

		LinkedList merged = first.merge(second);
		return merged;

	}

	public void reverseDR() {
		reverseDR(this.head, this.head, 0);
	}

	private void reverseDR(Node left, Node right, int level) {
		if (right == null) {
			return;
		}

		reverseDR(left, right.next, level + 1);
		if (level >= this.size() / 2) {
			int temp = left.data;
			left.data = right.data;
			right.data = temp;
			left = left.next;
		}
	}

	class HeapMover {
		Node node;

		HeapMover(Node node) {
			this.node = node;
		}
	}

	public void reverseDRBtr() {
		HeapMover obj = new HeapMover(this.head);
		reverseDRBtr(obj, this.head, 0);
	}

	private void reverseDRBtr(HeapMover left, Node right, int level) {
		if (right == null) {
			return;
		}

		reverseDRBtr(left, right.next, level + 1);
		if (level >= this.size() / 2) {
			int temp = left.node.data;
			left.node.data = right.data;
			right.data = temp;
			left.node = left.node.next;
		}
	}

}
