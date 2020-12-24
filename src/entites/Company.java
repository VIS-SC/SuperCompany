package entites;

public class Company extends TaxPayer {

	private Integer numberofEmployees; 
	
	
	public Company() {
		
	}
	
	public Company(String name, Double anualIncome, Integer numberofEmployees) {
		super(name, anualIncome);
		this.numberofEmployees = numberofEmployees;
	}


	public Integer getNumberofEmployees() {
		return numberofEmployees;
	}

	public void setNumberofEmployees(Integer numberofEmployees) {
		this.numberofEmployees = numberofEmployees;
	}

	@Override
	public double tax() {
		if(numberofEmployees > 10) {
			return getAnualIncome() * 0.14;
		} else {
			return getAnualIncome() * 0.16;
		}
	}

}
