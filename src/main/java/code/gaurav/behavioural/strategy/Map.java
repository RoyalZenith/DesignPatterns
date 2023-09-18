package code.gaurav.behavioural.strategy;

import java.awt.geom.GeneralPath;

public class Map {
    private GoogleMap map;
    public  Map(GoogleMap mp){
        this.map = mp;
    }
    public void showPath(){
        map.showPath();
    }
}
