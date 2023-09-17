package code.gaurav.creational.prototype.simple;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
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

    @Override
    public String toString() {
        return "IntelligentStudent{} " + super.toString() + "iq :"+iq;
    }
}
