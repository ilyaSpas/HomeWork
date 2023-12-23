package org.example.service;

import org.example.dto.User;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class UserServiceTest {

    private UserService userService;

    @BeforeAll
    static void prepareBeforeAll(){
        System.out.println("Before all" );
    }

    @BeforeEach
    void prepareBeforeEach(){
        System.out.println("Before each" + this);
        userService = new UserService();
    }

    @AfterEach
    void prepareAfterEach(){
        System.out.println("After each");
    }

    @Test
    void usersEmptyIfNoUserAdded() {
        System.out.println("Test №1");
        List<User> userList = userService.getAll();
        assertTrue(userList.isEmpty(), "user list should be empty");
    }

    @Test
    void usersSizeIfUserAdded() {
        System.out.println("Test №2 ");
        userService.add(new User());
        userService.add(new User());
        userService.add(new User());
        userService.add(new User());

        List<User> userList = userService.getAll();
        assertEquals(4, userList.size());
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After all");
    }
}
