public class Hogwarts {
    private String name;
    private String surname;
    private int spellPower;
    private int transgression;

    public Hogwarts(String name, String surname, int spellPower, int transgression) {
        this.name = name;
        this.surname = surname;
        this.spellPower = spellPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getSpellPower() {
        return spellPower;
    }
    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
    public void compareTo(Hogwarts anotherStudent) {
        int sumOfFirstStudent = this.getSpellPower() + this.getTransgression();
        int sumOfSecondStudent = anotherStudent.getSpellPower() + anotherStudent.getTransgression();
        String result1 = sumOfFirstStudent > sumOfSecondStudent ? this.getName() + " обладает бОльшей мощностью магии, чем " +
                anotherStudent.getName() + ". "
                : anotherStudent.getName() + " обладает бОльшей мощностью магии, чем " + this.getName() + ". ";
        System.out.println(result1);
    }
        @Override
    public String toString() {
        return "Имя Фамилия " + getName() + " " + getSurname() + "; Мощность заклинания "+getSpellPower() + ": Трансгрессия " + getTransgression();
    }
}
