import java.util.Scanner;

class Hello
{
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int temperature=sc.nextInt();
        // temperature=((temperature-32)*5)/9;
        // System.out.println(temperature);
        for(int row=1;row<=10;row++){
            for(int numberOfStars = 1; numberOfStars <= row; numberOfStars++)
             {
                System.out.print("*");
            }
            System.out.println();//Gotonextline}
    }
}
}