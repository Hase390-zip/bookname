package np.project.bookname;

public class Bookname {
  private String bookname;
  private String author;
  private int publishedYear;
  private String kanaName;
  private String birthplace;

  public String getDeathDate() {
    return deathDate;
  }

  public void setDeathDate(String deathDate) {
    this.deathDate = deathDate;
  }

  public String getBookname() {
    return bookname;
  }

  public void setBookname(String bookname) {
    this.bookname = bookname;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getPublishedYear() {
    return publishedYear;
  }

  public void setPublishedYear(int publishedYear) {
    this.publishedYear = publishedYear;
  }

  public String getKanaName() {
    return kanaName;
  }

  public void setKanaName(String kanaName) {
    this.kanaName = kanaName;
  }

  public String getBirthplace() {
    return birthplace;
  }

  public void setBirthplace(String birthplace) {
    this.birthplace = birthplace;
  }

  public int getDeathAge() {
    return deathAge;
  }

  public void setDeathAge(int deathAge) {
    this.deathAge = deathAge;
  }

  public String getCauseOfDeath() {
    return causeOfDeath;
  }

  public void setCauseOfDeath(String causeOfDeath) {
    this.causeOfDeath = causeOfDeath;
  }

  private String deathDate;
  private int deathAge;
  private String causeOfDeath;
}