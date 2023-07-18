package virtualpet;

public class VirtualPet {

    private static final int NEEDED_KNOWLEDGE_LEVEL = 10;
    private static final int NEEDED_EXP_TO_LEVEL_UP = 5;

    private static final int EXP = 0;

    private static final int DEFAULT_HUNGER = 3;
    private static final int DEFAULT_THIRST = 4;
    private static final int DEFAULT_BOREDOM = 2;
    private static final int DEFAULT_TIREDNESS = 4;
    private static final int DEFAULT_WASTE = 2;
    private static final int DEFAULT_SICKNESS = 0;

    private static final int PLAY_WITH_JAKE_GAIN = 2;
    private static final int PUT_JAKE_TO_SLEEP_GAIN = 2;

    private int hunger;
    private int tiredness;
    private int thirst;

    public VirtualPet() {
        hunger = 3;
        tiredness = 4;
        thirst = 4;
    }

    public void feed() {
        hunger -= 1;
    }

    public void water() {
        thirst -= 1;
    }

    public void sleep() {
        tiredness -= 3;
    }

    public int getHunger() {
        return hunger;
    }

    public int getTiredness() {
        return tiredness;
    }

    public int getThirst() {
        return thirst;
    }

    // public boolean isGrownUp() {
    // return false;
    // }
    // public void setIsGrownUp(boolean isGrownUp) {}

    // public void feedJake() {
    // }
    // public void giveJakeWater() {
    // }
    // public void playWithJake() {
    // }
    // public void putJakeToSleep() {
    // }
    // public void takeJakeForAWalk() {
    // }
    // public void giveJakeSomeMedicine() {
    // }
}
