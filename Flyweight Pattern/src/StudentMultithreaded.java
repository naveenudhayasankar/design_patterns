/* Making the Student class thread safe by restricting object creation using the new operator. */
public class StudentMultithreaded {
    private String name;
    private int id;
    private double score;
    private double averageScore;
    private final static StudentMultithreaded studentSingleton = new StudentMultithreaded();

    private StudentMultithreaded(){

    }

    /* Getters and setters for the flyweight class' properties. */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    /* Calculate and return the standing of the student. */
    public double getStanding() {
        return ( score / averageScore - 1.0) * 100;
    }

    public static StudentMultithreaded getInstance(){
        return studentSingleton;
    }
}
