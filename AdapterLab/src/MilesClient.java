public class MilesClient {
    public double distance(double mph,double hours){
       //create a new MtoKAdapter instance
        MtoKAdapter mtoK = new MtoKAdapter();
       //call its distance method
        double distance = mtoK.distance(mph, hours);
        return distance; //distance in miles
    }
}