public class Lecture14 {
    public static void main(String[] args) {
        System.out.println("\n-----String methods-----\n ");

        String name = "Ayush";

        // String is immutable in java, so whenever a method is used it returns a new
        // string or value, according to the method.

        // Method // Description
        // 1.length() Returns the length of string.
        // 2.toLowerCase() Converts all characters to lower case.
        // 3.toUpperCase() Converts all characters to upper case.
        // 4.trim() Returns a new string after removing all the leading and trailing
        // spaces from the original list
        // 5.substring(start,end) Returns a substring/slice of a string from the start
        // and end index, start is included and end is excluded.
        // 6.replace(a,b) Returns a new string after replacing a with b.
        // 7.startsWith("Sh") Returns true if the string starts with the specified
        // character/string.
        // 8.endsWith("ya") Return true if the string ends with the specified
        // character/string.
        // 9.charAt(3) Returns the character at a given index position.
        // 10.indexOf("s") Returns the index of the first occurence of the specified
        // character/string.
        // 11.lastIndexOf("y") Returns the last index of the specified character/string.
        // 12.equals("Taku") Returns true if the given string is equal to "Taku".
        // 13.equalsIgnoreCase("Taku") Returns true if the given string is equal to
        // "Taku" irrespective of whether uppercase or lowercase.

        // Escape sequence charcters.
        // \n => newline
        // \t => tab
        // \' => single quote
        // \\ => backslash

        System.out.println("Original Name string: " + name);
        System.out.println("Length: " + name.length());
        System.out.print("Lower Case: " + name.toLowerCase());
        System.out.println("\tUpper Case: " + name.toUpperCase());

        String value = "    Hemloo   ";

        System.out.println("New string: " + value);
        System.out.println("Trimmed value: " + value.trim());

        System.out.println("Substring of name string [2:]= " + name.substring(2, name.length()));
        System.out.println("Replacing 'Ay' to 'Sh' = " + name.replace("Ay", "Sh"));
        System.out.println("Stats with 'Ay' = " + name.startsWith("Ay"));
        System.out.println("Ends with 'sh' = " + name.endsWith("sh"));
        System.out.println("Character at index 2: " + name.charAt(2));
        System.out.println("Index of 's': " + name.indexOf('s'));
        System.out.println("Last index of 'u': " + name.lastIndexOf('u'));
        System.out.println("Equals to 'Ayush' = " + name.equals("Ayush"));
        System.out.println("Equals to 'ayUsH' = " + name.equalsIgnoreCase("ayUsH"));

    }
}
