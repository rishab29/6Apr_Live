package Lecture17;

import Lecture15.StackUsingArrays;

public class DynamicStack extends StackUsingArrays {

	public DynamicStack(int capacity) {
		super(capacity);
	}

	public void push(int item) throws Exception {
		if (this.data.length == this.size()) {
			int[] arr = new int[2 * this.data.length];
			for (int i = 0; i < this.data.length; i++) {
				arr[i] = this.data[i];
			}

			this.data = arr;
		}

		super.push(item);
	}

}
