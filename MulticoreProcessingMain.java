public class MulticoreProcessingMain {

    public static void main(String[] args) {
        MulticoreProcessing solver = new MulticoreProcessing();
        int[] speed = {40,20};
        int[] cores = {2,4};
        System.out.println("1: " + solver.fastestTime(2000, 5, speed, cores));

        int[] speed1 = {10,20};
        int[] cores1 = {2,4};
        System.out.println("2: " + solver.fastestTime(2000, 5, speed1, cores1));

        int[] speed2 = {10};
        int[] cores2 = {3};
        System.out.println("4: " + solver.fastestTime(1000, 0, speed2, cores2));

        int[] speed3 = {39,37,44};
        int[] cores3 = {8,16,6};
        System.out.println("5: " + solver.fastestTime(10000, 5, speed3, cores3));
    }
}