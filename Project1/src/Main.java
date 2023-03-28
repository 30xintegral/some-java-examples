
public class Main {
    public static void main(String[] args) {
        numberToWords(765);
        System.out.println(getDigitCount(8956425));
    }

    public static void  numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }
        int count = getDigitCount(number);
        number = reverse(number);
        while(number>9){
            int digit = number%10;
            switch (digit){
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
                default -> System.out.println("ERROR");
            }
            number /=10;
        }
        switch (number){
            case 0 -> System.out.println("Zero");
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            default -> System.out.println("ERROR");
        }

    }

    public static int reverse(int number){
        int reversed=0;
        while(number!=0){
            int digit = number%10;
            reversed = reversed*10 + digit;
            number /=10;
        }
        return reversed;
    }

    public static int getDigitCount(int number){
        int counter = 0;
        while(number>9){
            number/=10;
            counter++;
        }
        counter++;
        return counter;
    }

}
