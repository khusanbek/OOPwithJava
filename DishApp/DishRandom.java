
import java.util.Random;
public class DishRandom {

    public void run() {

        String[] brands =
                {"Wilmax", "Luminarc", "Villeroy"};
        String[] substances =
                {"Porcelain", "Metal", "Wood"};

        Random random = new Random();

        Dish[][] dishes = new Dish[4][0];

        Dish[] dishOne = new Dish[3];
        Dish[] dishTwo = new Dish[4];
        Dish[] dishThree = new Dish[2];
        Dish[] dishFour = new Dish[3];

        dishes[0] = dishOne;
        dishes[1] = dishTwo;
        dishes[2] = dishThree;
        dishes[3] = dishFour;

        for(Dish dishArray[] : dishes)
        {
            for(int i = 0; i < dishArray.length; i++) {
                int randomBrand = random.nextInt(3);
                int randomSubstance = random.nextInt(3);

                dishArray[i] = new Dish(brands[randomBrand], substances[randomSubstance]);
            }
        }

        for(Dish dishArray[] : dishes)
        {
            for(int i = 0; i < dishArray.length; i++)
                System.out.print(" " + dishArray[i]);

            System.out.println();
        }
    }
}
