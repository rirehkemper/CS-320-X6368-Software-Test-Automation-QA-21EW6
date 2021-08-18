package Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import snhucs320.ContactService;
import org.junit.jupiter.api.DisplayName;

class ContactServiceTest {
	
	//setup process
	
	//establish test variables
	protected static  String testFirstName,  testLastName,  testPhoneNumber, testAddress;
	
	protected static String testFirstName2,  testLastName2,  testPhoneNumber2, testAddress2;
	
	//test enumeration for each test
	@BeforeEach
		void setup() {
		testFirstName = "Allen";
		testLastName = "Rehkemper";
		testPhoneNumber = "5555555555";
		testAddress = "1234 Mockingbird Ln";
		
		testFirstName2 = "Richard";
		testLastName2 = "Ray";
		testPhoneNumber2 = "1233214455";
		testAddress2 = "123 Main St";
				
				
	}
	
	//Exercise and Verify 
	@Test
	@DisplayName ("Contact Service Test")	
	void testAddMultipleContact() {
		ContactService test = new ContactService();
		assertEquals(0,test.getContactCount());
		
		
		// CREATE 2 CONTACTS
		test.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
		assertEquals(1,test.getContactCount());
		
		test.addContact(testFirstName2, testLastName2, testPhoneNumber2, testAddress2);
		assertEquals(2,test.getContactCount());
    }
	
	
    		
	@Test
	@DisplayName ("Contact Service Delete Test")	
	void testDeleteContact() {
		ContactService test = new ContactService ();
		test.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
		test.addContact(testFirstName2, testLastName2, testPhoneNumber2, testAddress2);
		
		assertEquals(2,test.getContactCount());
		
	
		String testContactId = test.getContactIdsByLastName(testLastName).get(0);
		String test2ContactId =  test.getContactIdsByLastName(testLastName2).get(0);
		
		
		try {
			test.deleteContact(testContactId);
			assertEquals(1,test.getContactCount());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			test.deleteContact(test2ContactId);
			assertEquals(0,test.getContactCount());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	@Test
	@DisplayName ("Contact Service Update Test")
	void testUpdateContact() throws Exception {
		ContactService test = new ContactService ();

		test.addContact(testFirstName, testLastName, testPhoneNumber, testAddress);
		test.addContact(testFirstName2, testLastName2, testPhoneNumber2, testAddress2);
		String testContactId = test.getContactIdsByLastName(testLastName).get(0);		
		String test2ContactId = test.getContactIdsByLastName(testLastName2).get(0);	
		
		assertEquals("Rehkemper", test.getLastNameById(testContactId));
		System.out.println(test.getLastNameById(testContactId));
		
		test.updateContactLastName(testContactId, "testname");
		System.out.println(test.getLastNameById(testContactId));
		assertEquals("testname", test.getLastNameById(testContactId));
		
		assertEquals("Ray", test.getLastNameById(test2ContactId));
	}
}
