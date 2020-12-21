package com.oreilly.demo.controllers;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class HelloControllerUnitTest {

    @Test
    void testSayHello() {
        HelloController controller = new HelloController();
        Model model = new BindingAwareModelMap();
        String result = controller.sayHello("Dolly", model);
        assertEquals("hello", result);
        assertEquals("Dolly", model.getAttribute("user"));
    }

    @Test
    void testSayHelloWithMockObject() {
        HelloController controller = new HelloController();
        Model model = Mockito.mock(Model.class);
        when(model.addAttribute(anyString(),any())).thenReturn(model);
        String result = controller.sayHello("Dolly", model);
        assertEquals("hello", result);
        verify(model).addAttribute(eq("user"), anyString());
    }
}