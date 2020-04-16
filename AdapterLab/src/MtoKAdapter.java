public class MtoKAdapter extends MilesClient {
    public double distance(double mph,double hours) {
        KilometersAdaptee k = new KilometersAdaptee();

        double kph = mph * 1.609;

        double distanceK = k.distancek(kph, hours);
        double distanceM = distanceK / 1.609;

        return distanceM;
    }
}
