package org.example.designPattern.builder;

/**
 * Why Use the Builder Pattern?
 * ✅ Readable and clean object creation (no telescoping constructors).
 * ✅ Immutable object (fields are final).
 * ✅ Flexible (optional fields can be set or skipped).
 */

public class Student {

    // required field
    private String name;
    private int age;
    // optional
    private  String course;
    private  String university;

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
    public String getUniversity() { return university; }

    // Private Constructor
    private Student(StudentBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.course = builder.course;
        this.university = builder.university;
    }

    // Builder Class
    public static class StudentBuilder {
        private String name;
        private int age;
        private String course;
        private String university;

        public StudentBuilder(String name, int age) {  // Required fields
            this.name = name;
            this.age = age;
        }

        public StudentBuilder setCourse(String course) {
            this.course = course;
            return this;
        }

        public StudentBuilder setUniversity(String university) {
            this.university = university;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age +
                ", course='" + course + "', university='" + university + "'}";
    }

}
