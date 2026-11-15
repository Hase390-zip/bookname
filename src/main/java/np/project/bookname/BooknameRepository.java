package np.project.bookname;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BooknameRepository {

  @Select("""
        SELECT
            b.name,
            b.published_year,
            a.author_name,
            a.kana_name,
            a.birthplace,
            a.death_date,
            a.death_age,
            a.cause_of_death
        FROM book b
        INNER JOIN author a ON b.author_id = a.author_id
        WHERE a.author_name = #{author}
        LIMIT 1
        """)
  @Results({
      @Result(property = "bookname", column = "name"),
      @Result(property = "author", column = "author_name"),
      @Result(property = "publishedYear", column = "published_year"),
      @Result(property = "kanaName", column = "kana_name"),
      @Result(property = "birthplace", column = "birthplace"),
      @Result(property = "deathDate", column = "death_date"),
      @Result(property = "deathAge", column = "death_age"),
      @Result(property = "causeOfDeath", column = "cause_of_death")
  })
  Bookname searchByAuthor(@Param("author") String author);
}