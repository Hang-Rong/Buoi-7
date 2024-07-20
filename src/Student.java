import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private float[] scores;
    private String gender;

    public Student(int id, String name, float[] scores, String gender) {
        this.id = id;
        this.name = name;
        this.scores = scores;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float[] getScores() {
        return scores;
    }

    public void setScores(float[] scores) {
        this.scores = scores;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float calculateAverageScore() {
        float sum = 0;
        for (float score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
    @Override
    public String toString() {
        return "Điểm: " + Arrays.toString(scores);
    }
}
