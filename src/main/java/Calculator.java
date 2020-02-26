import java.util.Scanner;

public class Calculator {

        public static  int add(int...number)
        {
            int sum = 0;
            for(int i = 0; i < number.length; i++)
             {
               sum = sum + number[i];
             }
            return sum;

        }

        public static  int Multiplication(int...num)
        {
            int product = 1;
             for(int i = 0; i < num.length; i++)
             {
                product = product * num[i];
             }

             return product;
        }

        public static void main(String[]args)
        {
            Scanner scan = new Scanner(System.in);

            System.out.println("How many numbers you want to compute?");
            int n = scan.nextInt();
            int num[] =new int[n];

            System.out.println("Enter "+n+" Numbers to add and multiply");

            for(int i=0; i<num.length;i++)
            {
                num[i]=scan.nextInt();

            }

            System.out.println("Addition:");
            System.out.println("Sum: "+add(num));


            System.out.println("Multiplication");
            System.out.println("Product: "+Multiplication(num));    }


}
