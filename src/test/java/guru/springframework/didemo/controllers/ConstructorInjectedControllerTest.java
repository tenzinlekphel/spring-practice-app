package guru.springframework.didemo.controllers;

import guru.springframework.didemo.controller.ConstructorInjectedController;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }
}
