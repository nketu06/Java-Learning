package org.example.designPattern;

import org.example.designPattern.builder.Student;
import org.example.designPattern.prototypeAndRegistry.IntelligentStudentProto;
import org.example.designPattern.prototypeAndRegistry.StudentProto;
import org.example.designPattern.prototypeAndRegistry.StudentRegistry;
import org.example.designPattern.singleton.DoubleLock;
import org.example.designPattern.singleton.Eager;
import org.example.designPattern.singleton.SingleThreaded;
import org.example.designPattern.singleton.SynchronizeMultiThread;


/**
 * singleton notes Link
 * {https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples}
 */
public class Main {

    public static void main(String[] args) {

        // eager loading
        Eager e1 = Eager.getInstance();
        Eager e2 = Eager.getInstance();
        System.out.println(e1.hashCode() +" "+e2.hashCode()+" Eager");


        // Single thread
        SingleThreaded s1 = SingleThreaded.getInstance();
        SingleThreaded s2 = SingleThreaded.getInstance();
        System.out.println(s1.hashCode() +" "+s2.hashCode()+" SingleThreaded");

        // Synchronized
        SynchronizeMultiThread s3 = SynchronizeMultiThread.getInstance();
        SynchronizeMultiThread s4 = SynchronizeMultiThread.getInstance();
        System.out.println(s3.hashCode() +" "+s4.hashCode()+" Synchronize");


        //Doublecheck
        DoubleLock d1 = DoubleLock.getInstance();
        DoubleLock d2 = DoubleLock.getInstance();
        System.out.println(d1.hashCode() +" "+d2.hashCode()+" DoubleLock");


        /**
         * Builder design pattern
         */
        System.out.println("\n*****  Builder Design Pattern  *****");

        Student student = new Student.StudentBuilder("Nishant",1)
                .setCourse("CSE")
                .setUniversity("VTU").
                build();
        System.out.println(student);


        /**
         * Prototype and Registry design pattern
         */
        System.out.println("\n*****  Prototype and Registry design pattern  *****");

        StudentProto s = new IntelligentStudentProto("vtu","Nish",100,100);
        StudentProto copy=s.clone();
        System.out.println(s);
        System.out.println(copy);

        // with registry

        StudentRegistry studentRegistry = new StudentRegistry();
        StudentProto studentProto = studentRegistry.get("DEFAULT");
        studentProto.setName("Nishant");
        System.out.println(studentProto);


    }

}
