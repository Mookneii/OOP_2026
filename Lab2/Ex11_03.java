public class Ex11_03 {
    public static void main(String[] args) {

        IDCard c1 = new IDCard();
        c1.name = "Sok Dara";
        c1.id = 1001;
        c1.gender = "Male";
        c1.nationality = "Cambodian";
        c1.expirationDate = "2030";

        IDCard c2 = new IDCard();
        c2.name = "Srey Pov";
        c2.id = 1002;
        c2.gender = "Female";
        c2.nationality = "Cambodian";
        c2.expirationDate = "2031";

        IDCard c3 = new IDCard();
        c3.name = "Vannak";
        c3.id = 1003;
        c3.gender = "Male";
        c3.nationality = "Cambodian";
        c3.expirationDate = "2029";

        IDCard[] cards = {c1, c2, c3};

        for (int i = 0; i < cards.length; i++) {
            System.out.println("Name: " + cards[i].name);
            System.out.println("ID: " + cards[i].id);
            System.out.println("Gender: " + cards[i].gender);
            System.out.println("Nationality: " + cards[i].nationality);
            System.out.println("Expiration: " + cards[i].expirationDate);
            System.out.println();
        }
    }
}
class IDCard {

    String name;
    int id;
    String gender;
    String nationality;
    String expirationDate;
}