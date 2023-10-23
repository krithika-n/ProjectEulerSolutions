public class Main {
    public static void main(String[] args){
        long answer;
        answer = prob1.sumOfMultiples(1000);
        display(answer);
        answer = prob1.evenFibonacciNumbers(4000000);
        display(answer);
        answer = prob1.largestPrimeFactor(600851475143);
        display(answer);
        return;
    }

    public static void display(long answer){
        System.out.println(answer);
    }
}
