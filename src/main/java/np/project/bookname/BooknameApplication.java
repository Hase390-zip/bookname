package np.project.bookname;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BooknameApplication {

	private final BooknameRepository booknameRepository;

	public BooknameApplication(BooknameRepository booknameRepository) {
		this.booknameRepository = booknameRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BooknameApplication.class, args);
	}

	@GetMapping("/booknameInfo")
	public String booknameInfo(@RequestParam String author) {
		Bookname book = booknameRepository.searchByAuthor(author);

		if (book == null) {
			return "該当する本が見つかりません";
		}

		return "題名：" + book.getBookname() + "<br>"
				+ "作者：" + book.getAuthor() + "<br>"
				+ "ふりがな：" + book.getKanaName() + "<br>"
				+ "出版年：" + book.getPublishedYear() + "年<br>"
				+ "出身地：" + book.getBirthplace() + "<br>"
				+ "没年月日：" + book.getDeathDate() + "<br>"
				+ "死亡年齢：" + book.getDeathAge() + "<br>"
				+ "死因：" + book.getCauseOfDeath();
	}
}