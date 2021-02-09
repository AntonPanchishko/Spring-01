import config.AppConfig;
import model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        User bob = new User();
        bob.setName("Bob");
        bob.setLastname("Alison");
        bob.setEmail("BobAlison@mail.com");
        User alice = new User();
        alice.setName("Alice");
        alice.setLastname("Alison");
        alice.setEmail("AliceAlison@mail.com");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.add(bob);
        userService.add(alice);
        userService.listUsers().forEach(System.out::println);
    }
}
