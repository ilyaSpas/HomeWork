package org.example.service;

import org.example.entity.User;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("\u001B[33m" + "Before all\n" + "\033[0m");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("\u001B[33m" + "After all" + "\033[0m");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("\033[0;32m" + "Before each test" + "\033[0m");
    }

    @AfterEach
    void afterEach(){
        System.out.println("\033[0;35m" + "After each test\n" + "\033[0m");
    }

    @Test
    void usersListEmptyIfUsersNotAdded() {
        System.out.println("Test 1");
        UserService userService = new UserService();
        List<User> allUsers = userService.getAllUsers();
        assertTrue(allUsers.isEmpty(),
                "User list should be empty");
    }

    @Test
    void usersListSizeAfterAdded(){
        System.out.println("Test 2");
        UserService userService = new UserService();
        userService.add(new User());
        assertEquals(1, userService.getAllUsers().size(),
                "Size should be 1");
    }
}