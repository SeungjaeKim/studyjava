package chapter2.ch24;

/**
 * 1001 학번 Lee와 1002학번 Kim, 두 학생이 있습니다.
 * Lee 학생은 국어와 수학 2과목을 수강했고, Kim 학생은 국어, 수학, 영어 3과목을 수강하였습니다.
 * Lee 학생은 국어 100점, 수학 50점입니다.
 * Kim 학생은 국어 70점, 수학 85점, 영어 100점 입니다.
 * Student와 Subject 클래스를 만들고 ArrayList를 활용하여 두 학생의 과목 성적과 총점을 출력하세요
 */

public class StudentTest {
    public static void main(String[] args) {
        Student lee = new Student(1001, "Lee");

        lee.addSubject("국어", 100);
        lee.addSubject("수학", 50);

        Student kim = new Student(1002, "Kim");

        kim.addSubject("국어", 70);
        kim.addSubject("수학", 85);
        kim.addSubject("영어", 100);

        lee.showStudentInfo();
        System.out.println("=================================");
        kim.showStudentInfo();


    }
}
