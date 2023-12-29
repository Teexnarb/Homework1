public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int hardworking, int loyalty, int honesty, int spellPower, int transgression) {
        super(name, surname, spellPower, transgression);
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
    public void compareTo(Hufflepuff anotherStudent) {
        int sumOfFirstStudent = this.getHardworking() + this.getLoyalty() + this.getHonesty();
        int sumOfSecondStudent = anotherStudent.getHardworking() + anotherStudent.getLoyalty() + anotherStudent.getHonesty();
        int sumOfFirstStudentMagic = this.getSpellPower() + this.getTransgression();
        int sumOfSecondStudentMagic = anotherStudent.getSpellPower()+ anotherStudent.getTransgression();
        String result1 = sumOfFirstStudentMagic > sumOfSecondStudentMagic ? this.getName() + " обладает большей магией чем " +
                anotherStudent.getName() + ". " : anotherStudent.getName() + " обладает большей магией, чем " + this.getName() + ". ";
        System.out.println(result1);
        String result = sumOfFirstStudent > sumOfSecondStudent ? this.getName() + " лучший пуффендуец, чем "  + anotherStudent.getName() + ". "
                : anotherStudent.getName() + " лучший пуффендуец, чем " + this.getName() + ". ";

        System.out.println(result);
    }
    @Override
    public String toString() {
        return super.toString() +"; Трудолюбие " + getHardworking() + "; Верность " + getLoyalty() + "; Честность " + getHonesty();
    }
}
