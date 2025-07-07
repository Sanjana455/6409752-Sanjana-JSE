package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    void testGreetingWithMockAndStub() {
        // Arrange
        UserRepository mockRepo = mock(UserRepository.class);
        when(mockRepo.findNameById(101)).thenReturn("Sanjana");

        UserService service = new UserService(mockRepo);

        // Act
        String greeting = service.getGreeting(101);

        // Assert
        assertEquals("Welcome, Sanjana", greeting);

        // Verify interaction
        verify(mockRepo).findNameById(101);
    }
}
