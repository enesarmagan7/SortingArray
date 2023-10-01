package Week2;

import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dizinin boyutunu girin: ");
        int n=sc.nextInt();
        int numbers[]=new int[n];
        System.out.println("Dizinin elemanlarını girin: ");
        for(int i=0; i<n; i++){

            System.out.print(i+1+". Elemanı: ");
            numbers[i]=sc.nextInt();
        }
        int sayac=0;
        for(int i=0;i<numbers.length; i++){
            for(int k=0; k< numbers.length; k++){
                if(numbers[i]>numbers[k]) {
                   sayac= numbers[i];

                    numbers[i] = numbers[k];
                    numbers[k] = sayac;

                }
            }

        }
        System.out.print("Sıralama: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(  numbers[i]+" ");
        }
    }
}
