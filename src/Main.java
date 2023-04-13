import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("rectangle or circle(r/c)");
        char type = sc.next().charAt(0);

        switch(type){
            case 'r' :
                System.out.print("Enter lenghth :");
                int l = sc.nextInt();

                System.out.print("Enter width :");
                int w = sc.nextInt();

                System.out.println("area or peri(1/2)");
                int num = sc.nextInt();

                rec rec  = new rec();
                rec.w = w;
                rec.l = l;

                switch(num){
                    case 1:
                        System.out.print(rec.calArea());


                    case 2:
                        System.out.print(rec.calPeri());

                    default:
                        System.out.print("error input");

                }


            case 'c' :
                System.out.print("Enter radius :");
                int r = sc.nextInt();

                System.out.println("area or peri(1/2)");
                int num2 = sc.nextInt();

                circle c = new circle();
                c.radius = r;

                switch(num2){
                    case 1:
                       System.out.println( c.calArea());

                    case 2:
                       System.out.println(c.calPeri());

                    default:
                        System.out.print("error input");
                }
            default:
                System.out.print("error input");
        }
    }
}