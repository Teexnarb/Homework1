public class Hogwarts {
    private String name;
    private String surname;
    private int spellPower;

    public Hogwarts(String name, String surname, int spellPower) {
        this.name = name;
        this.surname = surname;
        this.spellPower = spellPower;
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
}
