public class NotificationService {

    private EmailService emailService;

    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String email) {
        // some registration logic...
        emailService.sendEmail(email, "Welcome to our service!");
    }
}
