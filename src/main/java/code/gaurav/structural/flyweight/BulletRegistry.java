package code.gaurav.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BulletRegistry {
    Map<BulletType, Bullet> mp = new HashMap<>();
    public void setRegistry(Bullet bullet){
        mp.put(bullet.getType(), bullet);
    }

    public Bullet getRegistry(BulletType type){
        return mp.get(type);
    }
}
