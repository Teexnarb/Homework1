public class Ravenclaw extends  Hogwarts {
    private int smart;
    private int sage;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String name, String surname, int smart, int sage, int witty, int fullOfCreativity, int spellPower) {
        super(name, surname, spellPower);
        this.smart = smart;
        this.sage = sage;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    @Override
    public String toString() {
        return super.toString() + "; Мудрость " + getSmart() + "; Остроумие " + getSage() + "; Полны творчеста " + getWitty();
    }
}
