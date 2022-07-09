package com.user;

import com.user.controller.UserController;
import com.user.entity.User;
import com.user.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.MonoWhenFunctionsKt;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceApplicationTests {

	@Autowired
	UserController userController;
	@MockBean
	UserServiceImpl userService;
	@Test
	 public void getmethod(){
		Mockito.when(userService.getUser(1311L)).thenReturn(  new User(1311L,"Bhavani Krishna","988888732"));
		assertEquals(1311L,UserController.getUser);
	}

	@Test
	void contextLoads() {
	}

}
