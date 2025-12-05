package ThucHanh04;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public Student findById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id))
                return s;
        }
        return null;
    }

    public void deleteById(String id) {
        Student s = findById(id);
        if (s != null) {
            students.remove(s);
            System.out.println("Đã xóa sinh viên có ID: " + id);
        } else {
            System.out.println("Không tìm thấy sinh viên!");
        }
    }
}

