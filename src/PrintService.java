public class PrintService {
    public void print(Gryffindor[] gryffindors) {
        System.out.println("---------------------------------------------------------------------------------------------");
        int sum1 = 0;
        int sum = 0;
        int number = 0;
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            sum1 = gryffindor.getNobility() + gryffindor.getHonor() + gryffindor.getBravery();
            if (sum < sum1) {
                sum = sum1;
                number = i;
            }
        }
        System.out.println(gryffindors[number].getName()+" " +  gryffindors[number].getSurname()+" - "+sum + " баллов, является лучшим стуудентом Грифендора" );
        int sum2 = 0;
        int sum3 = 0;
        int number1 = 0;
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            sum2 = gryffindor.getSpellPower();
            if (sum3 < sum2) {
                sum3 = sum2;
                number1 = i;
            }
        }
        System.out.println(gryffindors[number1].getName() + " " + gryffindors[number1].getSurname()+ " - " + sum3 + " баллов и имеет самую сильную магию");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя Фамилия " + gryffindor.getName() + " " + gryffindor.getSurname() + "; Благодаство "+ gryffindor.getNobility() + "; Честь " + gryffindor.getHonor() + "; Храбрость "+ gryffindor.getBravery() + "; Мощность заклинания " + gryffindor.getSpellPower());
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }
    public void print(Hufflepuff[] hufflepuffs) {
        int sum1 = 0;
        int sum = 0;
        int number = 0;
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            sum1 = hufflepuff.getHardworking() + hufflepuff.getHonesty() + hufflepuff.getLoyalty();
            if (sum < sum1) {
                sum = sum1;
                number = i;
            }
        }
        System.out.println(hufflepuffs[number].getName()+" " +  hufflepuffs[number].getSurname()+" - "+sum + " баллов, является лучшим стуудентом Грифендора" );
        int sum2 = 0;
        int sum3 = 0;
        int number1 = 0;
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            sum2 = hufflepuff.getSpellPower();
            if (sum3 < sum2) {
                sum3 = sum2;
                number1 = i;
            }
        }
        System.out.println(hufflepuffs[number1].getName() + " " + hufflepuffs[number1].getSurname()+ " - " + sum3 + " баллов и имеет самую сильную магию");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя Фамилия " + hufflepuff.getName() + " " + hufflepuff.getSurname() + "; Трудолюбие " + hufflepuff.getHardworking() + "; Верность " + hufflepuff.getLoyalty() + "; Честность " + hufflepuff.getHonesty() + "; Мощность заклинания" + hufflepuff.getSpellPower());
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }

    public void print(Ravenclaw[] ravenclaws) {
        int sum1 = 0;
        int sum = 0;
        int number = 0;
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            sum1 = ravenclaw.getSage() + ravenclaw.getSmart() + ravenclaw.getFullOfCreativity() + ravenclaw.getWitty();
            if (sum < sum1) {
                sum = sum1;
                number = i;
            }
        }
        System.out.println(ravenclaws[number].getName()+" " +  ravenclaws[number].getSurname()+" - "+sum + " баллов, является лучшим стуудентом Грифендора" );
        int sum2 = 0;
        int sum3 = 0;
        int number1 = 0;
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            sum2 = ravenclaw.getSpellPower();
            if (sum3 < sum2) {
                sum3 = sum2;
                number1 = i;
            }
        }
        System.out.println(ravenclaws[number1].getName() + " " + ravenclaws[number1].getSurname()+ " - " + sum3 + " баллов и имеет самую сильную магию");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя фамилия " + ravenclaw.getName() + " " + ravenclaw.getSurname() + "; Ум " + ravenclaw.getSmart() + "; Мудрость " + ravenclaw.getSage() + "; Остроумие" + ravenclaw.getWitty() + "; Полны творчеста" + ravenclaw.getFullOfCreativity() + "; Мощность заклинания " + ravenclaw.getSpellPower());
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }

    public void print(Slytherin[] slytherins) {
        int sum1 = 0;
        int sum = 0;
        int number = 0;
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            sum1 = slytherin.getAmbition() + slytherin.getResourcefulness() + slytherin.getLustForPower()+ slytherin.getCunning()+ slytherin.getDetermination();
            if (sum < sum1) {
                sum = sum1;
                number = i;
            }
        }
        System.out.println(slytherins[number].getName()+" " +  slytherins[number].getSurname()+" - "+sum + " баллов, является лучшим стуудентом Грифендора" );
        int sum2 = 0;
        int sum3 = 0;
        int number1 = 0;
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin= slytherins[i];
            sum2 = slytherin.getSpellPower();
            if (sum3 < sum2) {
                sum3 = sum2;
                number1 = i;
            }
        }
        System.out.println(slytherins[number1].getName() + " " + slytherins[number1].getSurname()+ " - " + sum3 + " баллов и имеет самую сильную магию");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя Фамилия " + slytherin.getName() + " " + slytherin.getSurname() + "; Хитрость " + slytherin.getCunning() + "; Решительность " + slytherin.getDetermination() + "; Амбициозность " + slytherin.getAmbition()+ "; Находчивость " + slytherin.getResourcefulness()+ "; Жажда власти " + slytherin.getLustForPower() + "; Мощность заклинания " + slytherin.getSpellPower());
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }
}
