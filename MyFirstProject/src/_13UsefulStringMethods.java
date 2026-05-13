public class _13UsefulStringMethods {
    public static void main(String[] args){

        String name = "Bro Code";

        int length = name.length();
        char letter = name.charAt(1); // access the character using indexes
        int index = name.indexOf("C"); // find the first occurrence of the character and write its index
        int lastIndex = name.lastIndexOf("o"); // written the last occurrence index of that character

//        name = name.toUpperCase(); // make all the character in Upper case
//        name = name.toLowerCase(); // make all the character in Lower case
//        name = "        Bro Code          ";
//        name = name.trim(); // it will remove all the unnecessary white spaces

//        name = name.replace("o", "a"); // it will char 'o' with char 'a'

        System.out.println(name.isEmpty()); // checks if the string is empty
        System.out.println(name.contains("d")); // check character is present or not
        System.out.println(name.equals("password")); // compare string if equal or not
        System.out.println(name);
    }
}
