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

    pclass myLoops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 20) {
            System.out.println("i = " + i); // will print unitil "i = 19"
            i += 1;
        }
    }
}

class Marathoon {

      public static int getMinIndex(int[] values) {
        int minValue = Integer.MAX_VALUE;
        int minIndex = -1;
        
        for(int i = 0; i < values.length; i++) {
            if (values[i] < minValue) {
                minValue = values[i];
                minIndex = i;
            }
        }
        
        return minIndex;
    }
    
    public static int getSecondMinIndex(int[] values) {
        int secondIdx = -1;
        int minIdx = getMinIndex(values);
        
        for(int i = 0; i < values.length; i++) {
            if (i == minIdx) {
                continue;
            }
            
            if (secondIdx == -1 || values[i] < values[secondIdx]) {
                secondIdx = i;
            }
        }
        
        return secondIdx;
    }

    public static void main(String[] arguments){
        double[] runnerTimes = {3.5, 2.8, 4.0, 2.5, 3.0};
        System.out.println("The best time is: " + bestPlayer(runnerTimes));
        System.out.println("The second best time is: " + secondBestPlayer(runnerTimes));
    }

}
