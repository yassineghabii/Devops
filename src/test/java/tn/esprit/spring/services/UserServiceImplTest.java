package tn.esprit.spring.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.entities.Role;  

import java.util.Date;
import java.util.List;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class UserServiceImplTest {

    @Autowired
    IUserService us;
		
	@Test
        @Order(1)
        public void testRetrieveAllUsers() {
                List<User> listUsers = us.retrieveAllUsers();
		Assertions.assertNotNull(listUsers);
        }
}
