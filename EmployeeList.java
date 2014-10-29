public class EmployeeList [

	private int[] employeeID;
	private String[] employeeName;

	public Employee (int size) {
		employeeID = new int[size];
		employeeName = new String[size];
		for (int i=0; i<size;; i++) {
			employeeID = 0;
			employeeName = "";
		}
	}
}