public class Student {
  private int rating;
  private String name;
  private static int studentCounter = 0;
  private static double allRatingCounter = 0.0D;

  public Student(String name) {
    ++studentCounter;
    this.name = name;
  }

  public Student(String name, int rating) {
    this.name = name;
    this.rating = rating;
  }

  public static double getAvgRating() {
    return studentCounter > 0 ? allRatingCounter / (double)studentCounter : 0.0D;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return this.rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
    allRatingCounter += this.rating;
  }

  public boolean betterStudent(Student student) {
    return this.rating > student.rating;
  }

  public void changeRating(int rating) {
    allRatingCounter -= this.rating;
    allRatingCounter += rating;
    this.rating = rating;
  }

  public static void removeStudent(Student student) {
    allRatingCounter -= student.rating;
    --studentCounter;
  }

  public String toString() {
    return this.name + " " + this.rating;
  }
}