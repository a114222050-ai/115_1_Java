public class StepCard {
    private int command;
    private int energy;

    public StepCard(int command, int energy) {
        this.command = command;
        this.energy = energy;
    }

    public int getCommand() {
        return command;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int value)
    {
        if (value >= 0 && value <= 20)
        {
            this.energy = value;
        }
        else
        {
            System.out.println("不合理數值");
        }
    }
}