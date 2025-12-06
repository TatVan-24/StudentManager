// package ThucHanh04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        // KHỞI TẠO DỮ LIỆU KHOA MẪU
        manager.addDepartment(new Department("IT", "Công nghệ Thông tin"));
        manager.addDepartment(new Department("ECO", "Kinh tế"));
        manager.addDepartment(new Department("ENG", "Ngôn ngữ Anh"));

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm sinh viên theo ID");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Hiển thị danh sách khoa"); // THÊM CHỨC NĂNG MỚI
            System.out.println("6. Thoát"); // CẬP NHẬT LỰA CHỌN THOÁT
            System.out.print("Chọn: ");

            int choice = 0;
            try {
                choice = sc.nextInt();
                sc.nextLine(); // clear buffer
            } catch (Exception e) {
                System.out.println("Lựa chọn phải là số!");
                sc.nextLine(); // clear input
                continue;
            }


            switch (choice) {
                case 1:
                    System.out.print("Nhập ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập điểm: ");
                    double score = sc.nextDouble();
                    sc.nextLine();

                    // YÊU CẦU CHỌN KHOA
                    manager.displayDepartments();
                    System.out.print("Chọn số thứ tự Khoa: ");
                    int depChoice = sc.nextInt();
                    sc.nextLine();

                    Department selectedDep = manager.getDepartmentByIndex(depChoice);

                    if (selectedDep != null) {
                        manager.addStudent(new Student(id, name, score, selectedDep));
                        System.out.println("Thêm sinh viên thành công!");
                    } else {
                        System.out.println("Lựa chọn khoa không hợp lệ. Thêm sinh viên thất bại!");
                    }
                    break;

                case 2:
                    manager.displayStudents();
                    break;

                case 3:
                    System.out.print("Nhập ID cần tìm: ");
                    String findId = sc.nextLine();
                    Student s = manager.findById(findId);
                    System.out.println(s == null ? "Không tìm thấy!" : s);
                    break;

                case 4:
                    System.out.print("Nhập ID cần xóa: ");
                    String delId = sc.nextLine();
                    manager.deleteById(delId);
                    break;
                    
                case 5: // HIỂN THỊ DANH SÁCH KHOA
                    manager.displayDepartments();
                    break;

                case 6:
                    System.out.println("Thoát chương trình!");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}