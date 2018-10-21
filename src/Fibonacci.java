public class Fibonacci {
    private int sum;
    public static void fibonacci(){
        int[] array = new int[10];
        array[0]=0;
        array[1]=1;
        for(int i=2;i<array.length;i++){
            array[i]=array[i-1]+array[i-2];
        }
        for (int x:array) {
            System.out.print(x+"\t");
        }
    }
    public int fibonacciRekurencja(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibonacciRekurencja(n-1)+fibonacciRekurencja(n-2);
        }
    }
    public static void main(String[] args) {
        fibonacci();
        System.out.println();

        Fibonacci fibonacci = new Fibonacci();
        for(int i=0;i<10;i++){
            System.out.print(fibonacci.fibonacciRekurencja(i)+"\t");
        }
    }
}