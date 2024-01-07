import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the lower number: ");
        int a = scn.nextInt();
        System.out.println("Enter the larger number: ");
        int b = scn.nextInt();
        printNumbers(a,b);
    }
    public static void printNumbers(int a, int b){
        for(int i =a+1 ; i<b; i++){
            System.out.print(i + " ");
        }
    }
}