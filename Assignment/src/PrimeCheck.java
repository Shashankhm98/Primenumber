public class PrimeCheck {
    public static void main(String[] args) {
        int number = 17;
        boolean isNotPrime = false;

        /*looping from 2 to number/2,because a number is not divisible by more than its half.*/
        for(int i=2; i <= number/2; i++){
            if(number % i == 0){
                isNotPrime = true;
                break;
            }
        }

        if(isNotPrime){
            System.out.println(number + " is a not Prime Number.");
        }else{
            System.out.println(number + " is a Prime Number.");
        }
    }
}


