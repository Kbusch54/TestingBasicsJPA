package orge.perscholas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class UserDAOTest {
	private UserDAO underTest;

	@BeforeEach
	void setUp() throws Exception {
		underTest = new UserDAO("Harry", "DodgeBall");
	}

	@AfterEach
	void tearDown() throws Exception {
		underTest = null;
	}

	@Test
	void testUserName() {
		String expected = "Harry";
		String actual = underTest.getName();
		assertEquals(expected, actual);
	}
	@Test
	void testPassword() {
		String expected = "DodgeBall";
		String actual = underTest.getPassword();
		assertEquals(expected, actual);
	}

}
