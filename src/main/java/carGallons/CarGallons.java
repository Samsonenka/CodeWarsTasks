package carGallons;

public class CarGallons {

    public static boolean goCar(double distanceToPump, double mpg, double fuelLeft) {

        double fullGallons = fuelLeft * mpg;

        if (distanceToPump > fullGallons){
            return false;
        }

        return true;
    }
}
