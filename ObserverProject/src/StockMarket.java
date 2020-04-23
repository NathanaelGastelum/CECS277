/*  Nathanael Gastelum
    April 22, 2020
    Purpose: This program uses the Observer Design Pattern to simulate stock trades
    Outputs: Each trader displays new trades on stocks they are tracking*/

public class StockMarket {
    public static void main(String[] args) {
        // Create tracked stocks
        Stock amzn = new Stock("AMZN");
        Stock tsla = new Stock("TSLA");
        Stock mu = new Stock("MU");
        Stock amd = new Stock("AMD");

        // Create traders
        Trader jacob = new Trader("Jacob");
        Trader jordan = new Trader("Jordan");
        Trader westley = new Trader("Westley");

        // Register traders as stock observers
        amzn.addObserver(jacob);
        tsla.addObserver(jacob);
        mu.addObserver(jacob);
        amd.addObserver(jacob);

        tsla.addObserver(jordan);

        tsla.addObserver(westley);
        amd.addObserver(westley);

        // Make some trades
        amzn.makeTrade(new Trade( jacob, "buy", 2363.49, amzn));
        tsla.makeTrade(new Trade( jacob, "sell", 732.11, tsla));
        amd.makeTrade(new Trade( westley, "buy", 55.92, amd));
        System.out.println();

        tsla.removeObserver(westley);
        amd.removeObserver(westley);
        mu.addObserver(jordan);
        amd.addObserver(jordan);

        amzn.makeTrade(new Trade( jacob, "buy", 2000.00, amzn));
        tsla.makeTrade(new Trade( jordan, "sell", 500.00, tsla));
        mu.makeTrade(new Trade( jordan, "buy", 43.91, mu));
        amd.makeTrade(new Trade( jordan, "sell", 50.00, amd));
        System.out.println();

        tsla.removeObserver(jordan);
        mu.removeObserver(jordan);
        amd.removeObserver(jordan);

        // Only one trader left
        amzn.makeTrade(new Trade( jacob, "sell", 3000.00, amzn));
        tsla.makeTrade(new Trade( jacob, "sell", 800.00, tsla));
        mu.makeTrade(new Trade( jacob, "sell", 3000.00, mu));
        amd.makeTrade(new Trade( jacob, "sell", 800.00, amd));

    }
}