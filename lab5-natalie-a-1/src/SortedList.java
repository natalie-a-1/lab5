
public class SortedList extends IntegerList {
	

	public SortedList() {

		super();

		//Arrays.sort(getArray());
	}

	public SortedList(int capacity) {

		super(capacity);

		//Arrays.sort(getArray());
	}

	public void add(int integer) {

		// Insert the integer in the list at the position that maintains the sorted
		// order.
		
		int idx = 0;

		if (super.size() == 0) {

			super.insert(0, integer);

		} else if (integer < super.get(0)) { 
			
			super.insert(0, integer);
			
		} else if (integer > super.get(super.size() - 1)) {
			
			super.insert(super.size(), integer);
			
		} else {
			
			for (int i = 0; i < super.size(); i++) {

				if (integer > super.get(i) && integer <= super.get(i+1)) {

					idx = i;
					
					break;
				}
				
			}
			super.insert(idx+1, integer);

		}
	}

	public void insert(int index, int integer) {

		throw new UnsupportedOperationException();

	}
}
