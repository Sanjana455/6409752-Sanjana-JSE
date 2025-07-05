import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    void testGreetingWithMockAndStub() {
        UserRepository mockRepo = mock(UserRepository.class);

        when(mockRepo.findNameById(101)).thenReturn("Sanjana");

        UserService service = new UserService(mockRepo);

        assertEquals("Welcome, Sanjana", service.getGreeting(101));

        verify(mockRepo).findNameById(101);
    }
}
