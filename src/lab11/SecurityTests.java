package lab11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecurityTests {
	
	

	@Test
	public void testLoginEmptyUserId_returnFalse() {
		
		String userId = "", password = "Freddy99";
		Security security = new Security();
		
		boolean actual = security.login(userId, password);
		boolean expected = false;
		
		assertEquals(expected, actual);
		// assertFalse(actual);   // can also use this assert
	}
	
	@Test
	public void testLoginEmptyPassword_returnFalse() {
		
		String userId = "Freddy", password = "";
		Security security = new Security();
		
		boolean actual = security.login(userId, password);
		boolean expected = false;
		
		assertEquals(expected, actual);
		// assertFalse(actual);   // can also use this assert
	}
	
	@Test
	public void testLoginPasswordLessThanMinimumChars_returnFalse() {
		
		String userId = "Freddy", password = "Freddy9";
		Security security = new Security();
		
		boolean actual = security.login(userId, password);
		boolean expected = false;
		
		assertEquals(expected, actual);
		// assertFalse(actual);   // can also use this assert
	}
	
	@Test
	public void testLoginPasswordNoUppercase_returnFalse() {
		
		String userId = "Freddy", password = "freddy99";
		Security security = new Security();
		
		boolean actual = security.login(userId, password);
		boolean expected = false;
		
		assertEquals(expected, actual);
		// assertFalse(actual);   // can also use this assert
	}
	
	@Test
	public void testLoginPasswordNoDigit_returnFalse() {
		
		String userId = "Freddy", password = "FreddyPass";
		Security security = new Security();
		
		boolean actual = security.login(userId, password);
		boolean expected = false;
		
		assertEquals(expected, actual);
		// assertFalse(actual);   // can also use this assert
	}
	
	@Test
	public void testLoginUserIdAndPasswordMeetRequirements_returnTrue() {
		
		String userId = "Freddy", password = "Freddy123";
		Security security = new Security();
		
		boolean actual = security.login(userId, password);
		boolean expected = true;
		
		assertEquals(expected, actual);
		
	}
	
	

	

}
