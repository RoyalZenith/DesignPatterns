package code.gaurav.structural.flyweight;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class Bullet {
    private String name;
    private String desc;
    private int size;
    private String img;
    private BulletType type;

}
