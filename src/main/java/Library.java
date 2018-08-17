import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "bean", "controller" })
public class Library {
	public static void main(String[] args) {
		SpringApplication.run(Library.class, args);
	}
}
