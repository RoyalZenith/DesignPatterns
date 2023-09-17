package code.gaurav.creational.prototype.registry;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class IntelligentStudent extends Student{
    private double iq;

    public IntelligentStudent(){}

    public IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }

}
