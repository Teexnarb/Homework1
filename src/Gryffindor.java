public class Gryffindor extends  Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int nobility, int honor, int bravery, int spellPower, int transgression) {
        super(name, surname, spellPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void compareTo(Gryffindor anotherStudent) {
        int sumOfFirstStudent = this.getBravery() + this.getHonor() + this.getNobility();
        int sumOfSecondStudent = anotherStudent.getBravery() + anotherStudent.getHonor() + anotherStudent.getNobility();
        int sumOfFirstStudentMagic = this.getSpellPower() + this.getTransgression();
        int sumOfSecondStudentMagic = anotherStudent.getSpellPower()+ anotherStudent.getTransgression();
        String result1 = sumOfFirstStudentMagic > sumOfSecondStudentMagic ? this.getName() + " обладает большей магией чем " +
                anotherStudent.getName() + ". " : anotherStudent.getName() + " обладает большей магией, чем " + this.getName() + ". ";
        System.out.println(result1);
        String result = sumOfFirstStudent > sumOfSecondStudent ? this.getName() + " лучший грифендорец, чем " +
                anotherStudent.getName() + ". " : anotherStudent.getName() + " лучший грифендорец, чем " + this.getName() + ". ";
        System.out.println(result);
    }

    @Override
    public String toString() {
        return super.toString() +"; Благодаство " + getNobility() + "; Честь " + getHonor() + "; Храбрость " + getBravery() ;
    }
}
