package ThucHanh04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm sinh viên theo ID");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID: ");
                    String id = sc.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập điểm: ");
                    double score = sc.nextDouble();

                    manager.addStudent(new Student(id, name, score));
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

                case 5:
                    System.out.println("Thoát chương trình!");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}

