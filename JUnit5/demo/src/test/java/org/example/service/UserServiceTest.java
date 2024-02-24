package org.example.service;

import org.assertj.core.api.Assertions;
import org.example.dto.User;
import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@Tag("firstGroup")
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@TestMethodOrder(MethodOrderer.DisplayName.class)
class UserServiceTest {

    private UserService userService;

    @BeforeAll
    static void prepareBeforeAll(){
        System.out.println("Before all" );
    }

    @BeforeEach
    void prepareBeforeEach(){
        System.out.println("Before each");
        userService = new UserService();
    }

    @Order(2)
    @DisplayName("Second test")
    @Test
    void usersEmptyIfNoUserAdded() {
        System.out.println("Test №1");
        List<User> userList = userService.getAll();
        assertTrue(userList.isEmpty(), "user list should be empty");
    }

    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    @Order(1)
    @DisplayName("First test")
    @Test
    void usersSizeIfUserAdded() {
        System.out.println("Test №2 ");

        userService.add(new User());
        userService.add(new User());
        userService.add(new User());
        userService.add(new User());

        List<User> userList = userService.getAll();

        assertEquals(4, userList.size());
        assertFalse(userList.isEmpty());
        assertThat(userList).hasSize(4);
        assertThat(userList).isNotEmpty();
    }

    //Проверка времени выполнения теста
    @Test
    void checkTimeoutMethod(){
        assertTimeout(Duration.ofMillis(200), () ->
                System.out.println("Hello world!"));
    }

    @AfterEach
    void prepareAfterEach(){
        System.out.println("After each");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After all");
    }
}
