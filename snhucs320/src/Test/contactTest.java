package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import snhucs320.contact;


class contactTest {

	@Test
	// contact parameters First name, Last name, Phone number, Address
	void testContact() {
		contact contact = new contact( "Allen", "Rehkemper", "5555555555","23853 Mockingbird");
		assertTrue(contact.getFirstName().equals("Allen"));
		assertTrue(contact.getLastName().equals("Rehkemper"));
		assertTrue(contact.getPhoneNumber().equals("5555555555"));
		assertTrue(contact.getAddress().equals("23853 Mockingbird"));
	}

}
