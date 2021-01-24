package Object;

public class Main {
    public static void main(String[] args) {

        Address address1 = new Address();
        address1.setIndex(192174);
        address1.setCountry("Russia");
        address1.setCity("Sankt-Peterburg");
        address1.setStreet("New Street");
        address1.setHouse(80);
        address1.setApartment(1210);

        System.out.println(address1.getIndex() + " " + address1.getCountry() + " " + address1.getCity() + " " + address1.getStreet() + " " + address1.getHouse() + " " + address1.getApartment());

    }
}
