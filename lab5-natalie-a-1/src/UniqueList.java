
public class UniqueList extends IntegerList {

	public UniqueList() {

		super();
	}

	public UniqueList(int capacity) {

		super(capacity);
	}

	public void add(int integer) {
		

		for (int i = 0; i < size(); i++) {

			if (get(i) == integer) {

				String message = "The integer " + integer + " is already in the list.";

				throw new IllegalArgumentException(message);

			}
	
		}
		super.add(integer);
	}

	public void insert(int index, int integer)  {
		//check if integer  already in list

		for (int i = 0; i < size(); i++) {

			if (get(i) == integer) {

				String message = "The integer " + integer + " is already in the list.";

				throw new IllegalArgumentException(message);
				
			} 
				
		}
		super.insert(index, integer);
	}
}
