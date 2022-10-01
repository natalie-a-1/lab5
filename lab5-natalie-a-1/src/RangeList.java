
public class RangeList extends IntegerList {

	public RangeList() {

		super();
	}

	public RangeList(int lowerBound, int upperBound) {

		super();


		if (lowerBound > upperBound) {

			String message = "The upper bound must be greater than or equal to the lower bound.";

			throw new IllegalArgumentException(message);
		} else {

			for (int i = lowerBound; i <= upperBound; i++) {
			
				super.insert(super.size(), i);
				
			}

		}
	}

	// Received help from Keon on the add(int lowerBound, int upperBound)

	public void add(int lowerBound, int upperBound) {

		if (lowerBound > upperBound) {

			String message = "The upper bound must be greater than or equal to the lower bound.";

			throw new IllegalArgumentException(message);

		} else if (super.size() == 0) {


			for (int i = lowerBound; i <= upperBound; i++) {

				//super.add(i);
				super.insert(super.size(), i);

			}

		} else if (lowerBound < super.get(0) && upperBound < super.get(super.size() - 1)) {

			for (int i = super.get(0) - 1; i >= lowerBound; i--) {

				super.insert(0, i);

			}

		} else if (lowerBound >= super.get(0) && upperBound < super.get(super.size() - 1)) {
	

			for (int i = super.get(super.size()) + 1; i <= upperBound; i++) {

				//super.add(i);
				super.insert(super.size(), i);
				


			}
			
		} else if (super.get(super.size() - 1) < lowerBound) {

			for (int i = upperBound; i >= lowerBound; i--) {

				super.insert(0, i);
			}

		} else {
			//**************** use counter?

			for (int i = super.get(0) - 1; i >= lowerBound; i--) {
				
				super.insert(0,i);
			}
			
			
			for (int i = super.get(super.size() - 1) + 1; i <= upperBound; i++) {

				//super.add(i);
				
				super.insert(super.size(), i);

			}

		}
	}

	public void remove(int lowerBound, int upperBound) {

		if (lowerBound > upperBound) {

			String message = "The upper bound must be greater than or equal to the lower bound.";

			throw new IllegalArgumentException(message);

		} else if (super.size() == 0) {

			String message = "Cannot remove range from an empty list.";

			throw new UnsupportedOperationException(message);

		} else if (super.indexOf(lowerBound) == -1 || super.indexOf(upperBound) == -1){
			
			String message = "Lower and/or upper bounds are out of the current list range.";

			throw new IllegalArgumentException(message);

			
		} else if (lowerBound > super.get(super.size() - 1) || upperBound < super.get(0)) {

			String message = "Lower and/or upper bounds are out of the current list range.";

			throw new IllegalArgumentException(message);

		} else if (lowerBound != super.get(0) && upperBound != super.get(super.size() - 1)) {

			String message = "Cannot remove non-terminal ranges.";

			throw new IllegalArgumentException(message);

		} else {

			for (int i = lowerBound; i <= upperBound; i++) {

				super.remove(super.indexOf(i));

			}

		}
	}
	
	public void insert(int lowerBound, int upperBound) {

		throw new UnsupportedOperationException();

	}

	public void add(int integer) {

		throw new UnsupportedOperationException();

	}
}
