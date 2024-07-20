import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        Student student1 = new Student(1, "Nam", new float[]{9.0f, 8.0f, 7.0f}, "Nam");
        Student student2 = new Student(2, "Hằng", new float[]{9.5f, 8.5f, 7.5f}, "Nữ");
        Student student3 = new Student(3, "Hoàng", new float[]{9.2f, 8.2f, 7.2f}, "Nam");
        Student student4 = new Student(4, "Hoa", new float[]{7.5f, 8.2f, 6}, "Nữ");
        Student student5 = new Student(5, "Trang", new float[]{5.5f, 9.2f, 8.3f}, "Nữ");

        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);
        studentManager.addStudent(student5);

        for (Student student : studentManager.students) {
            System.out.println(" MSV: " + student.getId() + ", Tên: " + student.getName() + ", Giới tính: " + student.getGender() + " ," + student.toString());
        }
        System.out.println("---------------------------");
        System.out.println("Điểm trung bình cả lớp là: " + studentManager.calculateAverageScoreOfClass());

        System.out.println("---------------------------");
        System.out.println("Tìm SV bằng ID (giả định là 4)");
        Student searchedStudent = studentManager.searchStudentById(4);
        if (searchedStudent != null) {
            System.out.println("Kết quả : " + searchedStudent.getName());
        } else {
            System.out.println("Không tìm thấy SV có ID tương ứng ");
        }
        System.out.println("----------------------");
        System.out.println("Tìm kiếm SV với tên có kí tự 'o' ");
        ArrayList<Student> searchedStudents = studentManager.searchStudentsByName("O");
        if (!searchedStudents.isEmpty()) {
            System.out.println("Những SV có tên chứa kí tự 'o':");
            for (Student student : searchedStudents) {
                System.out.println(student.getName());
            }
        } else {
            System.out.println("Không tìm thấy SV với tên chứa kí tự 'o' ");
        }
        System.out.println("--------------------");
        System.out.println("Tiến hành sửa thông tin SV với ID là 2");
        Student newStudent = new Student(2, "Duyên", new float[]{2.8f, 8.8f, 6.8f}, "Nữ");
        studentManager.editStudent(2, newStudent);

        System.out.println("DS sau chỉnh sửa: ");
        for (Student student : studentManager.students) {
            System.out.println(" MSV: " + student.getId() + ", Tên: " + student.getName() + ", Giới tính: " + student.getGender() + " ," + student.toString());
        }

        System.out.println("---------------------------");
        studentManager.deleteStudent(3);
        System.out.println("DS sau chỉnh sửa:");
        for (Student student : studentManager.students) {
            System.out.println(" MSV: " + student.getId() + ", Tên: " + student.getName() + ", Giới tính: " + student.getGender() + ", " + student.toString());
        }
        System.out.println("--------------------------");
        Student studentWithHighestScore = studentManager.getStudentWithHighestAverageScore();
        System.out.println("SV có điểm trung bình cao nhất là: " + studentWithHighestScore.getName());

    }
}