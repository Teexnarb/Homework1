public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int hardworking, int loyalty, int honesty, int spellPower) {
        super(name, surname, spellPower);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    @Override
    public String toString() {
        return super.toString() +"; Трудолюбие " + getHardworking() + "; Верность " + getLoyalty() + "; Честность " + getHonesty();
    }
}
