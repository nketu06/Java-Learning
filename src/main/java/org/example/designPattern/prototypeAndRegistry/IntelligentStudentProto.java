package org.example.designPattern.prototypeAndRegistry;

public class IntelligentStudentProto extends StudentProto {

    private int acheiverScore;

    public IntelligentStudentProto(String university, String name, int psp, int acheiverScore) {
        super(university, name, psp);
        this.acheiverScore = acheiverScore;
    }

    public IntelligentStudentProto(IntelligentStudentProto other) {
        super(other);
        this.acheiverScore = other.acheiverScore;
    }

    @Override
    public IntelligentStudentProto clone() {
        return new IntelligentStudentProto(this);
    }


}
