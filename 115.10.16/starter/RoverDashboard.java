public class RoverDashboard {
    public static void main(String[] args) {
        String roverName = "赤砂號"; // 可自訂名稱
        char zone = 'A';
        int energy = 7;
        boolean locked = false;

        double batteryPercent = calculateBatteryPercent(energy);
        int explorationCount = energy / 6; // 每 6 格能源可完成一次完整探索
        int remainingEnergy = energy % 6; // 完成完整探索後剩餘能源
        boolean validEnergy = energy >= 0 && energy <= 20; // 0 到 20（含端點）
        boolean canExplore = energy >= 6 && !locked; // 至少 6 格且未鎖定

        System.out.println("探測車：" + roverName + "；區域：" + zone);
        System.out.println("能源：" + energy + "；電量百分比：" + batteryPercent);
        System.out.println("完整探索次數：" + explorationCount + "；剩餘能源：" + remainingEnergy);
        System.out.println("有效能源：" + validEnergy + "；能否探索：" + canExplore);
    }

    static double calculateBatteryPercent(int energy) {
        // 以 20 為滿電量，將電量轉成百分比。
        if (energy <= 0) {
            return 0.0;
        }
        if (energy >= 20) {
            return 100.0;
        }
        return (energy / 20.0) * 100.0;
    }
}
