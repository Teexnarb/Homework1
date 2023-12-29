public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindor = {
                new Gryffindor("Garry", "Potter", 30, 50, 80, 90,50),
                new Gryffindor("Hermione", "Granger", 50, 40, 60, 80,60),
                new Gryffindor("Ron", "Weasley", 50, 50, 40, 60,30),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zachariah", "Smith", 60, 40, 50, 50,55),
                new Hufflepuff("Cedric", "Diggory", 40, 45, 45, 70,30),
                new Hufflepuff("Justin", "Finch-Fletchley", 70, 60, 50, 60,35),
        };
        Ravenclaw[] ravenclaw = {
                new Ravenclaw("Zhou", "Chang", 50, 60, 55, 60, 60,60),
                new Ravenclaw("Padma", "Patil", 40, 50, 30, 70, 65,40),
                new Ravenclaw("Marcus", "Belby", 60, 55, 45, 60, 65,40)
        };
        Slytherin[] slytherins = {
                new Slytherin("Draco", "Malfoy", 70, 30, 65, 50, 90, 70,35),
                new Slytherin("Graham", "Montague", 40, 50, 40, 30, 50, 50,45),
                new Slytherin("Gregory", "Goyle", 35, 45, 35, 50, 40, 45,40)
        };

        PrintService printService = new PrintService();
        printService.print(gryffindor);
        printService.print(hufflepuffs);
        printService.print(ravenclaw);
        printService.print(slytherins);

    }
}