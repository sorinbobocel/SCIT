import phoneBehaviour.Call;
import phoneBehaviour.Contact;
import phoneBehaviour.Message;
import phoneInterface.IPhone;
import phoneInterface.Phone;
import phones.*;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new SamsungGalaxyS6("495068594837283", "Red", "Plastic");
        Phone phone2 = new SamsungGalaxyS7("394857685940392", "Blue", "Aluminium");
        Phone phone3 = new Nokia800("394059675849302", "Black", "Plastic");
        Phone phone4 = new Nokia900("049302928191029", "Pink", "Polipropylene", true);

        Contact contact1 = new Contact("1", "0720192837", "Ion", "Neculce");
        Contact contact2 = new Contact("2", "0745928172", "Frank", "Herbert");
        Contact contact3 = new Contact("3", "0750392839", "Radu", "CelFrumos");


        phone1.addContact(contact1);
        phone1.addContact(contact2);
        phone1.addContact(contact3);
        phone1.listContacts();

        //First message is a test-check message. It will not be sent or stored in Message List.
        phone1.sendMessage(new Message("0720192837", "Test message .....................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................................1"));
        phone1.sendMessage(new Message("0720192837", "Test message 2"));
        phone1.sendMessage(new Message("0720192837", "Test message 3"));

        phone1.listMessages("0720192837");

        phone2.call(new Call("0720394859"));
        phone2.call(new Call("0754029302"));
        phone2.viewHistory();

        System.out.println(phone1.getBatteryLife());
        System.out.println(phone2.getBatteryLife());
        System.out.println(phone3.getBatteryLife());
        System.out.println(phone4.getBatteryLife());

    }
}
