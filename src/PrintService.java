public class PrintService {
    public void print(Gryffindor[] gryffindors) {
        System.out.println("---------------------------------------------------------------------------------------------");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println(gryffindor.toString());
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }
    public void print(Hufflepuff[] hufflepuffs) {
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println(hufflepuff.toString());
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }

    public void print(Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println(ravenclaw.toString());
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }

    public void print(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println(slytherin.toString());
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }
}
