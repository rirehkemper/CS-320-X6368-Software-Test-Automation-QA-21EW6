package snhucs320;
public class contact {

	// Generate Variables
//	private String contactID;
	private String FirstName;
	private String LastName;
	private String PhoneNumber;
	private String Address;
	
	//Construct exception methods and limits for variables
	
	public contact(String firstName, String lastName, String phoneNumber, String address){
		
		//return values
		//s.contactID = contactID;
		FirstName = firstName;
		LastName = lastName;
		PhoneNumber = phoneNumber;
		Address = address;

		
		//first name length limiter
		if(firstName == null || firstName.length()>10){
			throw new IllegalArgumentException("first Name cannot exceed 10 characters");
			}
		
		//last name length limiter
		if(lastName == null || lastName.length()>10){
			throw new IllegalArgumentException("last Name cannot exceed 10 characters");
			}
		
		//phone Number length limiter
		if(phoneNumber.length()!=10){
			throw new IllegalArgumentException("Phone Number length must be 10 digits");
			}
		
		//address length limiter
		if(address == null || address.length()>30){
			throw new IllegalArgumentException("address must be less than 30 characters");
			}
		
		
	}
		
	//getters and setters
//	public  String getContactID() {
//		return contactID;
//	}

//	public void setContactID(String contactID) {
//		this.contactID = contactID;
//	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		this.LastName = lastName;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	

}
