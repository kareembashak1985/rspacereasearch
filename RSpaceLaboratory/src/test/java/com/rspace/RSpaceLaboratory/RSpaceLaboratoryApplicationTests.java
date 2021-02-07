package com.rspace.RSpaceLaboratory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rspace.RSpaceLaboratory.config.HttpStatusCodes;
import com.rspace.RSpaceLaboratory.model.UserLabReport;
import com.rspace.RSpaceLaboratory.service.RspaceLabService;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class RSpaceLaboratoryApplicationTests {

	public static final Logger log = LoggerFactory.getLogger(RSpaceLaboratoryApplicationTests.class);

	@Autowired
	private RspaceLabService rspaceLabService;

	// setup()
	@BeforeAll
	public static void before() throws Exception {

	}

	// tearDown()
	@AfterEach
	void after() throws Exception {

	}

	/**
	 * 
	 * Test Case : Fetch the user lab details if you provide valid user name,
	 * pageNumber, pageSize, order
	 * 
	 */
	@Test
	@Order(1)
	void test_valid_user_samples() {
		log.info("Test case to fetch user sample in case of valid username");
		UserLabReport result = rspaceLabService.findUserSamples("kareembashak", 0, 10, "name asc");
		assertNotNull(result.getUserId());
		assertNotNull(result.getUserName());
		assertNotNull(result.getUserSamples());
		assertTrue(!result.getUserSamples().isEmpty());

	}
	
	/**
	 * 
	 * Test Case : Fetch the user lab details if you provide invalid user name,
	 * 
	 * 
	 */
	@Test
	@Order(2)
	void test_invalid_user_name() {
		log.info("Test case to fetch empty  sample and proper error details  in case of invalid  username, ");
		UserLabReport result = rspaceLabService.findUserSamples("test", 0, 10, "name asc");
		assertNull(result.getUserId());		
		assertTrue(result.getUserSamples().isEmpty());
		assertNotNull(result.getErrorDetails());
		assertEquals(HttpStatusCodes.STATUS_404.getHttpCode(), result.getErrorDetails().getStatus());
	}

}
