// package ThucHanh04;
public class Student {
    private String id;
    private String name;
    private double score;
    private Department department; 

    public Student(String id, String name, double score, Department department) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.department = department; 
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", department=" + department.getDepName() + 
                '}';
    }
}