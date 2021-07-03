package qa.guru;

import org.junit.jupiter.api.*;

public class FirstTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("before all method");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("start before each test");
    }

    @Test
    public void fistTest() {
        System.out.println("the first test");
        Assertions.assertTrue(true);
    }

    @Test
    public void secondTest() {
        System.out.println("the second test");
        Assertions.assertTrue(false);
    }

    @AfterEach
    public void after() {
        System.out.println("after each method");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("after all method");
    }

}
