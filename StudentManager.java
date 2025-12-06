// package ThucHanh04;

import java.util.ArrayList;
import java.util.LinkedList;

public class StudentManager {
    private LinkedList<Student> students = new LinkedList<>();
    private ArrayList<Department> departments = new ArrayList<>(); 
    public void addDepartment(Department d) {
        departments.add(d);
    }

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

    public Department getDepartmentByIndex(int index) {
        if (index > 0 && index <= departments.size()) {
            return departments.get(index - 1);
        }
        return null;
    }
    
    public void addStudent(Student s) {
        students.add(s);  
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    public Student findById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
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