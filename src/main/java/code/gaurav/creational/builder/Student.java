package code.gaurav.creational.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.xml.stream.events.StartDocument;

@Getter
@Setter
public class Student {
    private String name;
    private double age;
    private String address;

    private Student(){}

    public static class Builder {

        private String name;
        private double age;
        private String address;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(double age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build() {
            //validate all the required fields
            // create an object
            Student student = new Student();
            student.name = this.name;
            student.address = this.address;
            student.age = this.age;
            return student;
        }
    }
    public static Builder getBuilder(){
        return new Builder();
    }

}
