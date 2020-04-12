class Student {

	int [] grades;
	String index;
	String firstName;
	String lastName;

	//TODO constructor

	public Student(int[] grades, String index, String firstName, String lastName) {
		this.grades = grades;
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	//TODO seters & getters


	public int[] getGrades() {
		return grades;
	}

	public void setGrades(int[] grades) {
		this.grades = grades;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getAverage() {
		//TODO

		double sum = 0;

		for(int i = 0; i<grades.length;i++){

			sum+=grades[i];
		}

		return sum/grades.length;


	}

	public int ECTSCredits() {
		//TODO

		int total_credits = 0;

		for(int i = 0; i<grades.length; i++){

			if (grades[i] >= 6){
				total_credits+=6;
			}
		}

		return total_credits;
	}
}
