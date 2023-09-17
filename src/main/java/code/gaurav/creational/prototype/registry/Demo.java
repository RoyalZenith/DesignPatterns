package code.gaurav.creational.prototype.registry;

public class Demo {
    public static void main(String[] args) {
        PrototypeRegistry prototypeRegistry = new PrototypeRegistry();
        fillRegistry(prototypeRegistry);

        // create objects
        Student student1 = ((Student) prototypeRegistry.getRegistry("Sept22")).clone();
        student1.setName("Gaurav");
        student1.setAge(23);

        Student student2 = ((Student) prototypeRegistry.getRegistry("Sept22")).clone();
        student2.setName("Saurabh");
        student2.setAge(22);

//        System.out.println(student1+" -- "+student2 + " "+ student2.equals(student1));

        IntelligentStudent intelligentStudent = ((IntelligentStudent)prototypeRegistry.getRegistry("Sept22-Pro")).clone();
        intelligentStudent.setIq(24.5);
        intelligentStudent.setName("Gaurav Pro");

        IntelligentStudent intelligentStudent2 = ((IntelligentStudent)prototypeRegistry.getRegistry("Sept22-Pro")).clone();
        intelligentStudent2.setIq(24.59);
        intelligentStudent2.setName("Saurabh Pro");


        System.out.println(intelligentStudent + intelligentStudent.getName() + " -- " + intelligentStudent2 + " " + intelligentStudent2.getName() + intelligentStudent2.equals(intelligentStudent));

    }

    private static void fillRegistry(PrototypeRegistry prototypeRegistry) {
        Student student  = new Student();
        student.setBatchName("Sept22");
        student.setAddress("Jaipur");

        prototypeRegistry.setRegistry("Sept22",student);

        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setBatchName("Sept22-Pro");
        intelligentStudent.setAddress("Delhi");

        prototypeRegistry.setRegistry("Sept22-Pro",intelligentStudent);
    }
}
