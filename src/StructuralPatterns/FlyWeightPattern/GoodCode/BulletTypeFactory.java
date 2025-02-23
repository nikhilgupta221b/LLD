package StructuralPatterns.FlyWeightPattern.GoodCode;

import java.util.HashMap;

public class BulletTypeFactory {
    private static final HashMap<String, BulletType> bulletTypeMap = new HashMap<>();

    public static BulletType getBulletType(String color){
        if(bulletTypeMap.containsKey(color)){
            return bulletTypeMap.get(color);
        }
        else {
            BulletType bulletType = new BulletType(color);
            bulletTypeMap.put(color, bulletType);
            return bulletType;
        }
    }
}
