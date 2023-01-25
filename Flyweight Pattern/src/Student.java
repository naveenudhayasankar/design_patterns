/* The flyweight object that takes data from a larger object and will be shared. */
public class Student {
    private String name;
    private int id;
    private double score;
    private double averageScore;

    public Student(){

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
}
