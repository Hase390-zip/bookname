package np.project.bookname;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@Mapper
public interface booknamerepository {

  @Select("SELECT * FROM bookname WHERE author = #{author}")
  bookname searchbyauthor(String author);




}
