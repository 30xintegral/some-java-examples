import java.util.Scanner;

public class Function {
    private static int power;
    public static double x;
    private static int sum;
    private static int a;

    static Scanner scanner = new Scanner(System.in);

    public void setPower(int power){
        Function.power = power;
    }
    public static int function(){
        for (int i = 0; i <=power; i++) {
            System.out.println("emsali daxil edin :");
            a = scanner.nextInt();
            sum+=  a*Math.pow(x,i);
        }
        return sum;
    }
}
