package org.launchcode;
import java.util.Scanner;
public class Area {
   //nt length ;
public  static void main(String[] args){



//nt width;
//double radius;
    Scanner input = new Scanner((System.in));
 System.out.println("Enter a radius: ");
 Double radius = input.nextDouble();

 //double areaOfCicle = 3.14* radius * radius;
 System.out.println("The radius is :" + radius);

    //System.out.println("The radius is :" + radius);
    Double areaOfCicle = Circle.getArea(radius);

 System.out.println("The area of a circle :" + areaOfCicle);
//int length = input.next();
input.close();

}
}





