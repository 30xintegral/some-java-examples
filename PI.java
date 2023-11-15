public class PI {

    public static long factorial(int number){
        if (number==0 || number==1) return 1;
        return number*factorial(number-1);
    }

    public static void main(String[] args) {

        double R=0;
        double S=0;
        double M=0;
        for (int k = 0; k < 10; k++) {
            S+=Math.pow(-1,k)*factorial(6*k)*(545140134*k+13591409);
            M+=factorial(3*k)*Math.pow(factorial(k), 3)*Math.pow(640320, 3*k+1.5);
            R+=(S/M);
        }
        double pi=1/(12*R);
        System.out.println(pi);
    }
}
