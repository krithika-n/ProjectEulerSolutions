class prob1{
    public static long sumOfMultiples(int num){
        long sum = 0;
        for(int i=1; i <= num; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static long evenFibonacciNumbers(long upperLimit){
        long evenSum = 0;
        long prev = 1;
        long curr = 1;
        long next;
        while(curr <=upperLimit){
            next = prev + curr;
            if(next % 2 == 0){
                evenSum += next;
            }
            prev = curr;
            curr = next;
        }
        return evenSum;
    }

    public static long largestPrimeFactor(long number){
        return 0;
    }
}