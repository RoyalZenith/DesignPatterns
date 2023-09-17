package code.gaurav.creational.prototype.registry;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student implements Prototype<Student>{

    private String name;
    private String batchName;
    private double age;
    private String address;
    public Student(){}

    public Student(Student student) {
        this.name = student.name;
        this.batchName = student.batchName;
        this.age = student.age;
        this.address = student.address;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
