package code.gaurav.structural.flyweight;

public class Demo {

    public static void main(String[] args) {
        BulletRegistry bulletRegistry = new BulletRegistry();
        Bullet bullet = new Bullet();
        bullet.setName("9 MM");
        bullet.setDesc("Heavy");
        bullet.setType(BulletType.NINE_MM);
        bulletRegistry.setRegistry(bullet);

        FlyingBullet flyingBullet1 = new FlyingBullet(12,14,bullet);

        FlyingBullet flyingBullet2 = new FlyingBullet(12,14,bullet);

        System.out.println(flyingBullet1.getBullet() == flyingBullet2.getBullet());
    }
}
