package chapter2.ch24;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String name;
    ArrayList<Subject> subjectList = new ArrayList();

    public Student(){}

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSubject(String subject, int point) {
        subjectList.add(new Subject(subject, point));
    }

    public void showStudentInfo() {
        int totalCnt = 0;
        for (int i = 0; i < subjectList.size(); i++){
            System.out.println("학생 " + name + "의 " + subjectList.get(i).getSubjectName() + " 과목의 성적은 " + subjectList.get(i).getSubjectPoint() + "점 입니다.");
            totalCnt += subjectList.get(i).getSubjectPoint();
        }
        System.out.println("학생 " + name + "의 총점은 " + totalCnt + "점 입니다.");
    }
}
