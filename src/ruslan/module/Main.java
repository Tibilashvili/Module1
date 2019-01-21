package ruslan.module;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 4, 5, 1, 1, 3};


        elements(array);
    }

    public static void elements(int[] array) {
        int array2[] = array;
        int count = 0;


        for (int i = 0; i < array2.length - 1; i++){
            if (array[i] == array[i+1]){
                continue;
            }

            else{
                count++;
            }
        }

        System.out.println(count);




    }
}












