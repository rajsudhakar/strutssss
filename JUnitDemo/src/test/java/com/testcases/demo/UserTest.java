package com.testcases.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.vfislk.training.User;

class UserTest {
User user;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		user=new User();
	}

	@AfterEach
	void tearDown() throws Exception {
		user=null;
	}

	@Test @DisplayName("Testing greet")
	@Tag("greet")
	void testGreet() {
		String userName="Rajath";
	assertEquals("have a great day ",user.greet(userName));
	}
	void showFruits() {
		assertEquals( Arrays.asList("Apple","Banana","Mango"),user.showFruits());
	}
	void testFruitsLength() {
		List<String> fruits=user.showFruits();
		assertEquals(2,user.showFruits().size());
	}

}
