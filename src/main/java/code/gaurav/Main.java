package code.gaurav;

import code.gaurav.creational.builder.Student;
import code.gaurav.creational.singleton.DoubleLockCheckingSingleton;

public class Main {
    public static void main(String[] args) {

        //Singleton
        DoubleLockCheckingSingleton doubleLockCheckingSingleton = DoubleLockCheckingSingleton.getInstance();

        // Builder
        Student student = Student.getBuilder().setName("Gaurav").setAge(24.4).setAddress("Jaipur").build();
        System.out.println(student.getName()+" "+student.getAge()+" "+student.getAddress());

        //prototype
        //same package

        //factory
        //same package



    }
}