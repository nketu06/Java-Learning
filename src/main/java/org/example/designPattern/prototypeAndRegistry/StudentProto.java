package org.example.designPattern.prototypeAndRegistry;

public class StudentProto implements Prototype<StudentProto> {
    private String name;
    private String university;
    private int psp;

    public StudentProto(String university, String name, int psp) {
        this.university = university;
        this.name = name;
        this.psp = psp;
    }

    public StudentProto(StudentProto other){
        this.university = other.university;
        this.name = other.name;
        this.psp = other.psp;
    }

    @Override
    public StudentProto clone() {
        return new StudentProto(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }
}
