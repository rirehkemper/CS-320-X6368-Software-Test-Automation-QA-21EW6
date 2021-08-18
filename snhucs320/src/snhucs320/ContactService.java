package snhucs320;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.UUID;

public class ContactService {

	// Generate HashMap 
    public HashMap<String, contact> contactList;
    
    //Initalize HashMap
	public ContactService() {
		contactList = new HashMap<String, contact>();
	}
	
	//Add a unique ID contact to Array 
	public void addContact(String contactID, contact newContact) {
		contactList.put(contactID, newContact);
	}
	
	public void addContact(String firstname, String lastname, String phonenumber, String address) 
	{
		String contactID = UUID.randomUUID().toString().replaceAll("-", "").substring(0,10);
		contact contact = new contact(firstname, lastname, phonenumber, address);
		addContact(contactID, contact);
	}
			
	
	 // Delete a contact from the database
    public void deleteContact(String contactID) throws Exception {
    	
    	contactList.remove(contactID);
    }

    public int getContactCount() {
    	int size;
    	if (contactList.isEmpty()) {
    		size = 0;
    	} else {
    		size = contactList.size();
    	}
    	
    	return size;
    }
    
    
    public List<String> getContactIdsByFirstName(String firstName) {
    	List<String> id = new ArrayList<>();
    	
        for(Entry<String,contact> entry : contactList.entrySet()) {
        	if(entry.getValue().getFirstName().equalsIgnoreCase(firstName)) {id.add(entry.getKey());        	}
        }
    	return id;
    }
   
    public List<String> getContactIdsByLastName(String lastName) {
    	List<String> id = new ArrayList<>();
    	
        for(Entry<String,contact> entry : contactList.entrySet()) {
        	if(entry.getValue().getLastName().equalsIgnoreCase(lastName)) {id.add(entry.getKey());        	}
        }
    	return id;
    }
    
    public String getLastNameById(String id) {
    	String lastname = contactList.get(id).getLastName();
    	return lastname;
    }
    
    public contact getContactById(String id) {
    	contact con = contactList.get(id);
    	return con;
    }
    
    //update the contact first name
    public void updateContactFirstName(String id, String newFirstName) throws Exception {
    	// returnId(id).setFirstName(newFirstName);
    	contactList.get(id).setFirstName(newFirstName);
 
    }
    
    // Update the contact last name
    public void updateContactLastName(String contactID, String newLastName) throws Exception {
    	contactList.get(contactID).setLastName(newLastName);
    }
    
    public void updatephoneNumber(String contactID, String newPhoneNumber) throws Exception {
    	contactList.get(contactID).setPhoneNumber(newPhoneNumber);

    }

    // Update contact Address 
    public void updateContactAddress(String contactID, String newAddress) throws Exception {
    	contactList.get(contactID).setAddress(newAddress);
    }

       

}


	



