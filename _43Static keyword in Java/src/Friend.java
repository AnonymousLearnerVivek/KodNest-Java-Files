public class Friend {

    static int numOfFriends; // after using static now this variable belong and owned by the Class rather than any objects
    String name;

    Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends");
    }

}
