package practicums.practicum8;

public class Main {
    public static void main(String[] args) {
        Bedrijfsinventaris inventaris = new Bedrijfsinventaris("Bivak B.V.", 20000.00);

        Computer computer1 = new Computer("Acer Predator", "MAC123456789", 950.00, 2019);
        Computer computer2 = new Computer("Acer Predator", "MAC123456789", 950.00, 2019);

        Fiets fiets1 = new Fiets("Batavus", 500.00, 2019, 987456321);
        Fiets fiets2 = new Fiets("Batavus", 500.00, 2019, 987456321);

        Auto auto1 = new Auto("Volkswagen Transporter", 12500.00, 2017, "69-UVU-69");
        Auto auto2 = new Auto("Volkswagen Transporter", 12500.00, 2017, "69-UVU-69");

        Computer computer3 = new Computer("Asus Plompzak", "MACJIJOFMACIK", 650.00, 2017);
        Fiets fiets3 = new Fiets("Gazelle", 750.00, 2020, 123456789);
        Auto auto3 = new Auto("Volkswagen Combi", 15500.00, 2018, "RO-UTE-66");

        inventaris.schafAan(computer1);
        inventaris.schafAan(computer2);
        System.out.println(inventaris.toString());
        inventaris.schafAan(fiets1);
        inventaris.schafAan(fiets2);
        System.out.println(inventaris.toString());
        inventaris.schafAan(auto1);
        inventaris.schafAan(auto2);
        System.out.println(inventaris.toString());
        inventaris.schafAan(computer3);
        inventaris.schafAan(fiets3);
        inventaris.schafAan(auto3);
        System.out.println(inventaris.toString());

    }
}