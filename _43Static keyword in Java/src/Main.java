public class Main {
    public static void main(String[] args) {

        // Static = Makes a variable or method belong to the class
        //         rather than to any specific object.
        //         Commonly used for utility methods or shared resources

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("David");
        Friend friend4 = new Friend("John");
        Friend friend5 = new Friend("Joe");


//        System.out.println(friend1.name);
////        System.out.println(friend1.numOfFriends);
//
//        System.out.println(friend2.name);
////        System.out.println(friend2.numOfFriends);
//
//        System.out.printjln(friend3.name);
////        System.out.println(friend3.numOfFriends);
//
//        System.out.println(Friend.numOfFriends);

        Friend.showFriends();
    }
}
