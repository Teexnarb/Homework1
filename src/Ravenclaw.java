public class Ravenclaw extends  Hogwarts {
    private int smart;
    private int sage;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String name, String surname, int smart, int sage, int witty, int fullOfCreativity, int spellPower, int transgression) {
        super(name, surname, spellPower,transgression);
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
    public void compareTo(Ravenclaw anotherStudent) {
        int sumOfFirstStudent = this.getSmart() + this.getWitty() + this.getSage() + this.getFullOfCreativity();
        int sumOfSecondStudent = anotherStudent.getSmart() + anotherStudent.getSage() + anotherStudent.getWitty() + anotherStudent.getFullOfCreativity();
        int sumOfFirstStudentMagic = this.getSpellPower() + this.getTransgression();
        int sumOfSecondStudentMagic = anotherStudent.getSpellPower()+ anotherStudent.getTransgression();
        String result1 = sumOfFirstStudentMagic > sumOfSecondStudentMagic ? this.getName() + " обладает большей магией чем " +
                anotherStudent.getName() + ". " : anotherStudent.getName() + " обладает большей магией, чем " + this.getName() + ". ";
        System.out.println(result1);
        String result = sumOfFirstStudent > sumOfSecondStudent ? this.getName() + " лучший когтевранец, чем " +
                anotherStudent.getName() + ". "
                : anotherStudent.getName() + " лучший когтевранец, чем " + this.getName() + ". ";
        System.out.println(result);
    }

    @Override
    public String toString() {
        return super.toString() + "; Мудрость " + getSmart() + "; Остроумие " + getSage() + "; Полны творчеста " + getWitty();
    }
}
