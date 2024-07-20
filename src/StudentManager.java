import java.util.ArrayList;

public class StudentManager {
    public ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void editStudent(int id, Student newStudent) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(newStudent.getName());
                student.setScores(newStudent.getScores());
                student.setGender(newStudent.getGender());
                break;
            }
        }
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                return;
            }
        }
    }

    public float calculateAverageScoreOfClass() {
        float sum = 0;
        for (Student student : students) {
            sum += student.calculateAverageScore();
        }
        return sum / students.size();
    }

    public Student searchStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public ArrayList<Student> searchStudentsByName(String name) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().toLowerCase().contains(name.toLowerCase())) {
                result.add(student);
            }
        }
        return result;
    }

    public Student getStudentWithHighestAverageScore() {
        Student studentWithHighestScore = students.get(0);
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).calculateAverageScore() > studentWithHighestScore.calculateAverageScore()) {
                studentWithHighestScore = students.get(i);
            }
        }
        return studentWithHighestScore;
    }

}