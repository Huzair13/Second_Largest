import java.lang.management.MonitorInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the Array !!");
        int size=scanner.nextInt();

        System.out.println("Enter the Array Elements");
        int array[]=new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }

        int SecondLar=FindMax(array,size);
        System.out.println(SecondLar);

    }

    private static int FindMax(int[] array, int size) {
        int max= Integer.MIN_VALUE;
        int secondMax= Integer.MIN_VALUE;

        for(int iterator=0;iterator<size;iterator++){
            if(max<array[iterator]){
                max=array[iterator];
            }
        }
        for(int iterator=0;iterator<size;iterator++){
            if(secondMax<array[iterator] && array[iterator]<max){
                secondMax=array[iterator];
            }
        }
        if(secondMax==Integer.MIN_VALUE){
            return -1;
        }
        return secondMax;
    }
}