import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class NotificationServiceTest {

    @Test
    public void testEmailSentOnUserRegistration() {
        // Arrange
        EmailService mockEmailService = mock(EmailService.class);
        NotificationService notificationService = new NotificationService(mockEmailService);

        // Act
        notificationService.registerUser("user@example.com");

        // Assert (verify)
        verify(mockEmailService).sendEmail("user@example.com", "Welcome to our service!");
    }
}
