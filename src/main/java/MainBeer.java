/**
 * Created by widzew on 2016-07-30.
 */
public class MainBeer {
    public static void main(String[] args) {

        BeerData beer = new BeerData("Rebel Podwójnie Chmielone", 5, 12);
        BeerData beer1 = new BeerData("Ciechan", 6.0, 12.2);
        BeerData beer2 = new BeerData("Tenczynek Lager", 4.9, 12);


        System.out.println(beer);
        System.out.println(beer1);
        System.out.println(beer2);

        if(beer.isStrong()) {
            System.out.println("This beer is strong");
        } else {
            System.out.println("You can drink one more");
        }

        if(beer1.isStrong()) {
            System.out.println("This beer is strong");
        } else {
            System.out.println("You can drink one more");
        }
        if(beer2.isStrong()) {
            System.out.println("This beer is strong");
        } else {
            System.out.println("You can drink one more");
        }

    }
}
