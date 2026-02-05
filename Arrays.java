class myLoops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 20) {
            System.out.println("i = " + i); // will print unitil "i = 19"
            i += 1;
        }
    }
}

class Marathoon {

    public static double bestPlayer(double[] times){
        double bestTime = times[0];
        for (int i = 0; i < times.length; i++){
            if (times[i] < bestTime){
                bestTime = times[i];
            }
        }
        return bestTime;
    }

    public static double secondBestPlayer(double[] times) {
        double bestTime = bestPlayer(times);
        double secondBestTime = times[0];
        for (int i = 0; i < times.length; i++) {
            if (times[i] < secondBestTime && times[i] > bestTime){
            }
        }
        return secondBestTime;
    }

    public static void main(String[] arguments){
        double[] runnerTimes = {3.5, 2.8, 4.0, 2.5, 3.0};
        System.out.println("The best time is: " + bestPlayer(runnerTimes));
        System.out.println("The second best time is: " + secondBestPlayer(runnerTimes));
    }

}