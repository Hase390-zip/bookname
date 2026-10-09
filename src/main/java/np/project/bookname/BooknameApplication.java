package np.project.bookname;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BooknameApplication {

	@Autowired
	private booknamerepository repository;


	private String bookname = "吾輩は猫である";
	private String author = "夏目漱石";
	private int published_year = 1905;

	public static void main(String[] args) {
		SpringApplication.run(BooknameApplication.class, args);
	}

	@GetMapping ("/booknameInfo")
	public String booknames() {
		return "題名：" + bookname + " " + "<br>" +
				"作者："+ author + " " + "<br>" +
				"出版年："+ published_year + "年" + "<br>" +
				"--------------------------------------------------";
	}

	@PostMapping("/booknameInfo")
	public void setBookname(String bookname, String author, int published_year) {
		this.bookname = bookname;
		this.author = author;
		this.published_year = published_year;
	}


}
