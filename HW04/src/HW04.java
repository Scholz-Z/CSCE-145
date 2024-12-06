import java.util.Scanner;
public class HW04 
{

   // Circle class that stores the radius and calculate area
   static class Circle 
   {
       private double radius;

       public Circle(double radius) 
       {
           this.radius = radius;
       }

       public double getRadius() 
       {
           return radius;
       }

       public double getArea() 
       {
           return 3.14 * radius * radius;
       }
   }

   // Main method 
   public static void main(String[] args) { 
       Scanner key = new Scanner(System.in);  

       // asking for the users input
       
       System.out.print("Enter the number of circles: ");
       int size = key.nextInt();

       // Validate the size of the collection
       while (size <= 0) 
       {
           System.out.print("Please enter a valid size: ");
           size = key.nextInt();
       }

       Circle[] circles = new Circle[size]; // initializes circle size variable 
       
       for (int i = 0; i < size; i++) 
       {
           System.out.print("Enter radius for circle " + (i + 1) + ": ");
           double radius = key.nextDouble();
           circles[i] = new Circle(radius);
       }

       // Gives the options for user
       while (true) // while loop with boolean statement
       {
           System.out.println("\nChoose an option:");
           System.out.println("1. Sort areas ascending");
           System.out.println("2. Sort areas descending");
           System.out.println("3. Display unique areas");
           System.out.println("4. Quit");

           int choice = key.nextInt();
           switch (choice) // switch case
           {
               case 1:
                   CircleSort(circles, true);
                   displayCircles(circles);
                   break;
               case 2:
                   CircleSort(circles, false);
                   displayCircles(circles);
                   break;
               case 3:
                   displayUniqueAreas(circles);
                   break;
               case 4:
                   System.out.println("Exiting the program...");
                   System.exit(0);
                   key.close();
                   break;
               default:
                   System.out.println("Invalid option, try again.");
           }
       }
   }

   // Circle sorting circle areas in ascending or descending order
   public static void CircleSort(Circle[] circles, boolean ascending) {
       if (circles.length == 0) 
       {
           System.out.println("Cannot sort an empty collection.");
           return;
       }
       for (int i = 0; i < circles.length - 1; i++) // nested for loops and if else statements
       {
           for (int j = 0; j < circles.length - 1 - i; j++) 
           {
               if (ascending && circles[j].getArea() > circles[j + 1].getArea()) 
               {
                   Circle temp = circles[j];
                   circles[j] = circles[j + 1];
                   circles[j + 1] = temp;
               } 
               else if (!ascending && circles[j].getArea() < circles[j + 1].getArea()) 
               {
                   Circle temp = circles[j];
                   circles[j] = circles[j + 1];
                   circles[j + 1] = temp;
               }
           }
       }
   }

   // Displaying areas of all circles
   public static void displayCircles(Circle[] circles) {
       System.out.println("Circle areas:");
       for (Circle circle : circles) {
           System.out.println(circle.getArea());
       }
   }

   // Displaying unique circle areas
   public static void displayUniqueAreas(Circle[] circles) 
   {
       System.out.println("Unique circle areas:");
       for (int i = 0; i < circles.length; i++) 
       {
           boolean isUnique = true;
           for (int j = 0; j < circles.length; j++) 
           {
               if (i != j && circles[i].getArea() == circles[j].getArea()) 
               {
                   isUnique = false;
                   break;
               }
           }
           if (isUnique) 
           {
               System.out.println(circles[i].getArea());
           }
       }
   }
}




