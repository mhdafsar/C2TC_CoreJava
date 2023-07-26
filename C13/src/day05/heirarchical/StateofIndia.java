package day05.heirarchical;

public class StateofIndia {
	private String Countryname;

	public String getCountryname() {
		return Countryname;
	}

	public void setCountryname(String countryname) {
		Countryname = countryname;
	}
	

	public StateofIndia() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public StateofIndia(String countryname) {
		super();
		Countryname = countryname;
	}

	@Override
	public String toString() {
		return "India [Countryname=" + Countryname + "]";
	}
	
}