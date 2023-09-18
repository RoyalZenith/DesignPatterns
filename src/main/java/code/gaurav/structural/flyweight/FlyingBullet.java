package code.gaurav.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
public class FlyingBullet {
    private int x;
    private int y;

    // reference of bullet object
    private  Bullet bullet;

}
