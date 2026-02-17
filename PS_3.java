public class PS_3 {
    public static void main(String[] args) {
        /*
        1.Write a Java program to convert a string to lowercase.
        2.Write a Java program to replace spaces with underscores.
        3.Write a Java program to fill in a letter template which looks like below:
        
        // letter = “Dear <|name|>, Thanks a lot”
        // Replace <|name|> with a string (some name)

        4.Write a Java program to detect double and triple spaces in a string.
        5.Write a program to format the following letter using escape sequence characters.
            Letter = “Dear Harry, This Java Course is nice. Thanks”
        */

        // 1.
        String value = "TAKUsan";
        System.out.println("Original String: "+value);
        System.out.println("Lower Case String: "+value.toLowerCase());

        // 2.
        String text = "Hello World ";
        System.out.println("Orignal String: "+text);
        System.out.println("Replacing space with underscore: "+text.replace(' ','_'));

        // 3.
        String template = "Dear <|name|>, Thanks a lot";
        System.out.println("Original template: "+template);
        System.out.println("Replaced template: "+template.replace("<|name|>","Shreya"));

        // 4.
        String detect = "my  name is ayush not  kumar";

        System.out.println("Original string: "+detect);
        System.out.println("Double Spaces: "+detect.contains("  "));
        System.out.println("Triple Spaces: "+detect.contains("   "));
        detect = "my    name    is ayush  kumar";
        System.out.println("String editted now....");
        
        System.out.println("New string: "+detect);
        System.out.println("Double Spaces: "+detect.contains("  "));
        System.out.println("Triple Spaces: "+detect.contains("   "));

        // 5.
        String letter = "\"Dear Harry, This Java Course is nice. Thanks\"";

        System.out.println(letter);

    }
}
