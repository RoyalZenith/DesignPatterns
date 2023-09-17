package code.gaurav.creational.prototype.simple;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Gaurav");
        student1.setAge(24.4);
        student1.setBatchName("Sept22");
        student1.setAddress("Jaipur");

        Student student2 = student1.clone();
        student2.setAddress("Bharatpur");

        // create intelligent student object
        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setAddress("delhi");
        intelligentStudent.setBatchName("Sept_pro_22");
        intelligentStudent.setName("Gaurav Singhal");
        intelligentStudent.setAge(18);
        intelligentStudent.setIq(22);


        Student intelligentStudent1 = intelligentStudent.clone();
        intelligentStudent1.setName("Saurabh");


        System.out.println(intelligentStudent);
        System.out.println("------");
        System.out.println(intelligentStudent1);

        System.out.println(intelligentStudent1 == intelligentStudent);
    }
}
