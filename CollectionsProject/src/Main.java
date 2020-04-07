public class Main {

    public static void main(String[] args) {
        // Command line arguments
        // Help prompt
        if(args.length < 1) {
            System.out.println("No arguments, use \"h\" for help");
            return;
        }

        if (args[0].equals("h")) {
            System.out.println("Needs file path argument: source");
            return;
        }

        //TODO TreeMap arg
        if (args[0].equals("tm")) {
            System.out.println("Using TreeMap");

            long startTime = System.nanoTime();
            TreeTest tm = new TreeTest();
            tm.load();
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Time for loading into Map " + duration + " nano-seconds");

            /*startTime = System.nanoTime();
            tm.score();
            endTime = System.nanoTime();
            duration = endTime - startTime;
            System.out.println("Time for searching Map " + duration + " nano-seconds");*/

            return;
        }

        //TODO HashMap arg
        if (args[0].equals("tm")) {
            System.out.println("Using TreeMap");
            HashTest hm = new HashTest();
            return;
        }
    }
}
