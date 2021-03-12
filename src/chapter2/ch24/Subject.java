package chapter2.ch24;

public class Subject {
    private String subjectName;
    private int subjectPoint;

    public Subject(String subjectName, int subjectPoint) {
        this.subjectName = subjectName;
        this.subjectPoint = subjectPoint;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectPoint() {
        return subjectPoint;
    }

    public void setSubjectPoint(int subjectPoint) {
        this.subjectPoint = subjectPoint;
    }
}
