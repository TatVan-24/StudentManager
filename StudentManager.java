// package ThucHanh04;

import java.util.ArrayList;
import java.util.LinkedList;

public class StudentManager {
    private LinkedList<Student> students = new LinkedList<>();
    private ArrayList<Department> departments = new ArrayList<>(); // QUẢN LÝ DANH SÁCH KHOA

    // Phương thức thêm khoa (dùng để khởi tạo dữ liệu khoa)
    public void addDepartment(Department d) {
        departments.add(d);
    }

    // Phương thức hiển thị danh sách khoa
    public void displayDepartments() {
        if (departments.isEmpty()) {
            System.out.println("Danh sách khoa trống!");
            return;
        }
        System.out.println("--- DANH SÁCH KHOA ---");
        for (int i = 0; i < departments.size(); i++) {
            Department d = departments.get(i);
            System.out.println((i + 1) + ". " + d.getDepId() + " - " + d.getDepName());
        }
    }

    // Phương thức tìm khoa theo số thứ tự (dùng cho việc nhập sinh viên)
    public Department getDepartmentByIndex(int index) {
        if (index > 0 && index <= departments.size()) {
            return departments.get(index - 1);
        }
        return null;
    }
    
    // Thêm sinh viên (Cần truyền cả Department)
    public void addStudent(Student s) {
        students.add(s);  // LinkedList add cuối O(1)
    }

    // Hiển thị danh sách
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống!");
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