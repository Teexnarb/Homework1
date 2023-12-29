public class PrintService {
    public void print(Gryffindor[] gryffindors) {
        System.out.println("---------------------------------------------------------------------------------------------");
        gryffindors[1].compareTo(gryffindors[2]);
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println(gryffindor.toString());
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }
    public void print(Hufflepuff[] hufflepuffs) {
        hufflepuffs[1].compareTo(hufflepuffs[2]);
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println(hufflepuff.toString());
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }

    public void print(Ravenclaw[] ravenclaws) {
        ravenclaws[0].compareTo(ravenclaws[2]);
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println(ravenclaw.toString());
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }

    public void print(Slytherin[] slytherins) {
        slytherins[0].compareTo(slytherins[1]);
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println(slytherin.toString());
        }
        System.out.println("---------------------------------------------------------------------------------------------");
    }
}
