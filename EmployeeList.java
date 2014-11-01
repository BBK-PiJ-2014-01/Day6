public class EmployeeList {

	private int[] employeeID;
	private String[] employeeName;
	private int capacity;
	private int counter;


	public EmployeeList (int size) {
		employeeID = new int[size];
		employeeName = new String[size];
		for (int i=0; i<size; i++) {
			employeeID[i] = 0;
			employeeName[i] = "";
		}
		capacity = size;
		counter = 0;
	}

	public boolean empSet (int id, String name) {
		employeeID[counter] = id;
		employeeName[counter] = name;
		counter++;
		if (counter == capacity)
			return(false);
		else
			return(true);
	}

	public int empGetID(int x) {
		return(employeeID[x]);
	}	

	public String empGetName(int x) {
		return(employeeName[x]);
	}	

	public int empGetCurrentSize() {
		return(counter);
	}

}