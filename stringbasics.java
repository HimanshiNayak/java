import java.util.*;
//or import java.util.lang .. for strings
public class stringbasics {
   public static void main(String[] args){
    String s="helo";
    System.out.println(s);

    //taking input
    // Scanner sc = new Scanner(System.in);
    // String h= sc.next();  // takes only the first word of the srting
    // System.out.println(h);

    // String H= sc.nextLine(); //takes whole sentence as input
    // System.out.println(H );

    //str.length() :counts spaces as welll
    String sa = "Hello world";
    int len= sa.length();
    System.out.println(len);

    //or
    System.out.println(sa.length());

    //charAt(position):starts from 0
    System.out.println(sa.charAt(1));

    //indexOf(character) : gives the first occureance of the given char
//gives -1 if not present
    System.out.println(sa.indexOf('H'));

    //compareTo :compares two strings on lexographical bsics(checks tha alphabets one by one , if the ascii value is more thats ring is greater)
    //if equal give 0 , if first is greater gives +ve answer and -ve when second is greater
//the number it returns is actually the difference btw the two
  String a="abc"; 
  String b="bbc";
System.out.println(a.compareTo(b)); 
 String i="abc";
 String j="abc";
System.out.println(i.compareTo(j));
String k="dbc";
String l ="abc";
System.out.println(k.compareTo(l));

//startsWith("") , endsWith(""), contains(""):takes only strings
//true/false  .. the order of the char in string should be preserved
// String sa = "Hello world";
System.out.println(sa.contains("He"));
System.out.println(sa.startsWith("t"));
System.out.println(sa.endsWith("rld"));

//toUpperCase() , toLowerCase()

// String sa = "Hello world";
String sb= "world Hello";
System.out.println(sa.toUpperCase());
System.out.println(sa.toLowerCase());
//concat : concatinates two strings without space
System.out.println(sa.concat(sb));
System.out.println(sa.concat("hello"));

//+= string/char/number
//converts the others to string then adds

String sw="abc";
sw += "w";
sw += 'o';
sw += 10;
System.out.println(sw);

System.out.println("saw"+(10+20)); //saw 30 
System.out.println("saw"+10+20); //saw1020
System.out.println(10+20+"saw");//30saw
   } 
}
