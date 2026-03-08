// package EvenCharacterPrinting;

// public class Evencharacter {
//     public static void Evencharacters(String s) {
//         char[] c = s.toCharArray(); // convert string to char array

//         for (char ch : c) {

//             int num = ch - '0'; // convert char to number

//             if (num % 2 == 0) {
//                 System.out.print(num);
//             }
//         }
//     }

//     public static void main(String args[]) {
//         String s = "123456";
//         Evencharacters(s);

//     }
// }

// code for when String contains characters
package EvenCharacterPrinting;

public class Evencharacter {

    public static void Evencharacters(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(s.charAt(i));
            }
        }
    }

    public static void main(String args[]) {
        String s = "Geeks";
        Evencharacters(s);
        // Now the output will be "Ges" which are characters at even positions
    }
}
