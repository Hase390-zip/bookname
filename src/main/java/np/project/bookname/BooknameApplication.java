package np.project.bookname;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BooknameApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooknameApplication.class, args);
	}
	@GetMapping ("/booknames")
	public String booknames() {
		return "太宰治";
	}



}
