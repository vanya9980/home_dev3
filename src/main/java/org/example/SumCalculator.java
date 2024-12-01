package org.example;

public class SumCalculator {
    private static int result = 0;

    public static int getResult() {
        return result;
    }
    public static void setResult(int result) {
        SumCalculator.result = result;
    }

    public int sum(int n) {
        setResult(getResult()+n);

        if(n<1){
            throw new IllegalArgumentException();
        }
        else if(n==1){
            return result;
        }
        else{
            return sum(n-1);
        }
    }

}
