public class Main {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
    }

    public static int getLargestPrime(int number){
        if(number<=1){
            return -1;
        }
        int primeNumber = 0;
        int factor=0;
        for(int i=2;i<=number;i++){
            int counter=0;
            if(number%i==0){
                factor=i;
                for(int j=2;j<=factor;j++){
                    if(factor%j==0){
                      counter++;
                    }
                }
                if(counter<2){
                    primeNumber=factor;
                }
            }

        }

        return primeNumber;
    }
}
