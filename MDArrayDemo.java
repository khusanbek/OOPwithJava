
import java.util.Random;

public class MDArrayDemo {

    public static void main(String[] args) {

        Random rand = new Random();
        
        int myArray[][] = new int[5][0];

        int arrayOne[] = new int[10];
        int arrayTwo[] = new int[5];
        int arrayThree[] = new int[15];
        int arrayFour[] = new int[25];
        int arrayFive[] = new int[50];


        myArray[0] = arrayOne;
        myArray[1] = arrayTwo;
        myArray[2] = arrayThree;
        myArray[3] = arrayFour;
        myArray[4] = arrayFive;

        for(int index[] : myArray)
        {
            for(int i = 0; i < index.length; i++)
                index[i] = rand.nextInt(15) + 1;
        }

        for(int index[] : myArray)
        {
            for(int i = 0; i < index.length; i++)
                System.out.print(" " + index[i]);

            System.out.println();
        }
    }
}
