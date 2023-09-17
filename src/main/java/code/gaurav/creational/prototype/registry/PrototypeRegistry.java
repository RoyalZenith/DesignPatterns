package code.gaurav.creational.prototype.registry;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    Map<String, Object> mp = new HashMap<>();

    public void setRegistry(String key, Object obj){
        mp.put(key,obj);
    }

    public Object getRegistry(String key){
        return mp.get(key);
    }
}
