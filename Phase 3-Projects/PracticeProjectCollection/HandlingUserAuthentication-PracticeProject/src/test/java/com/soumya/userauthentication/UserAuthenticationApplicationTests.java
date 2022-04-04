package com.soumya.userauthentication;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.soumya.userauthentication.entity.User;
import com.soumya.userauthentication.service.UserService;

@SpringBootTest
class UserAuthenticationApplicationTests {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	// Success Test Method1
	@Test
	void authenticateUser1() {
		
		User myuser = new User("soumya@123","bubun_123");
		
		logger.info("Authenticating User-1......");
		
		
        assertNotNull(userService.authenticateUser(myuser));
        
        
   }
	// Success Test Method2
	@Test
	void authenticateUser2() {
		
		User myuser = new User("john$doe","john$john");
		
		logger.info("Authenticating User-2......");

        assertNotNull(userService.authenticateUser(myuser));
        
        
   }
	// Failure Test Method
	@Test
	void authenticateUser3() {
		
		User myuser = new User("Mike@dan","dan$MIKE");
		
		logger.info("Authenticating User-3......");
		
		
        assertNotNull(userService.authenticateUser(myuser));
        
        
   }
	
   

}
