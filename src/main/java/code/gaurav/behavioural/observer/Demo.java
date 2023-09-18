package code.gaurav.behavioural.observer;

public class Demo {
    public static void main(String[] args) {

        Group group = new Group();

        //create some user
        User user1 = new User(1);
        User user2 = new User(2);
        User user3 = new User(3);
        User user4 = new User(4);

        group.subscribe(user1);
        group.subscribe(user2);
        group.subscribe(user3);
        group.subscribe(user4);

        group.notifyUser("new message");

        group.unsubscribe(user3);

        group.notifyUser("new message again");


    }
}
