import java.util.Arrays;
import java.util.Scanner;

public class RepeatedNumber {


    static boolean isfind(int arr[],int value) {

        for (int i : arr) {
            if (i == value) {

                return true;
            }
        }
        return false;
    }

        public static void main(String[] args) {

            int x=0;
            Scanner input= new Scanner(System.in);
            System.out.println("Kaç sayı seçmek istersiniz");
            int n= input.nextInt();

            int [] array_numbers= new int [n];
            int [] duplicate= new int [n];


            for(int i=0; i< n ; i++){

                System.out.println("Lütfen sayı giriniz");
                array_numbers[i]= input.nextInt();

            }

            for( int i=0;i<n;i++){
                for(int j =i+1;j<n;j++){

                    if(array_numbers[i]==array_numbers[j]&& i!=j){
                        if(array_numbers[i]%2==0){
                            if(!isfind(duplicate,array_numbers[i])) {

                                duplicate[x++] = array_numbers[i];
                            }

                            break;
                        }
                    }
                }
            }

            for(int i=0;i<n;i++){
                 if(duplicate[i]!=0){

                        System.out.print(duplicate[i]+ "  ");

                 }
            }
        }
}
