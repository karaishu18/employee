
package employee;

import java.util.Scanner;

public class Employee {
    
    String n1="Robert";
        String n2="Sam";
        String n3="John";
        int y1=1994;
        int y2=2000;
        int y3=1999;
        String a1="64C-WallsStreet";
        String a2="68D-WallsStreet";
        String a3="26B-WallsStreet";

    public static void main(String[] args) {
        Employee obj1 = new Employee();
        Employee obj2 = new Employee();
        Employee obj3 = new Employee();
        System.out.println("Name      Year of joining           Address");
        System.out.println(""+obj1.n1+"        "+obj2.y1+"               "+obj3.a1);
        System.out.println(""+obj1.n2+"           "+obj2.y2+"               "+obj3.a2);
        System.out.println(""+obj1.n3+"          "+obj2.y3+"               "+obj3.a3);
    }
    
    
}
