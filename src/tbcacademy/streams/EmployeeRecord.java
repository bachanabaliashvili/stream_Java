package tbcacademy.streams;

public record EmployeeRecord(Integer id, String name, double salary) {
	
	public double salaryIncrement( double s) {
	
		return this.salary+s;
	}

	public Integer getId()
	{
		return this.id;
	}


	@Override
	public boolean equals(Object obj) {
		if(this.name.equalsIgnoreCase(((EmployeeRecord)obj).name()))
				return true;
		else 
			return false;
		
	}

	@Override
	public int hashCode() {
		return 1;
	}
	
}
