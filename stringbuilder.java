//ued to remove theimmutability
//we can set some characters also
import java.util.*;
public class stringbuilder{
 public static void main(String[] args) {
    //append : to add the char/int/float/string to existing one

    StringBuilder sr = new StringBuilder("hello");
    sr.append(" world");
    System.out.println(sr);
    // sr.append(true);
    // System.out.println(sr);

    //setCharAt(index , char):to change a particular char

    sr.setCharAt(0,'m');
    System.out.println(sr);
    
    sr.setCharAt(0,'h');
    //insert(In,ch):insertion in btw, and will inc the length ..ca insert anything

    sr.insert(2,'h');
    System.out.println(sr);
//     sr.insert(2,"helllo");
//  System.out.println(sr);

//delete(ind,chr)

sr.deleteCharAt(2);
 System.out.println(sr);

 //reversing a string

 StringBuilder sw= new StringBuilder("physics");
 sw.reverse();
 System.out.println(sw);

 //delete in range:
 sw.delete(2,4); // 2 inc 4 excl
 System.out.println(sw);

 //

 }
}