// package ThucHanh04;

import java.util.ArrayList;

import java.util.LinkedList;

public class StudentManager {
    private LinkedList<Student> students = new LinkedList<>();

    // Thêm sinh viên
    public void addStudent(Student s) {
        students.add(s);  // LinkedList add cuối O(1)
    }

    // Hiển thị danh sách
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Tìm theo ID (duyệt tuần tự O(n))
    public Student findById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    // Xóa sinh viên theo ID
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

