import java.util.HashMap;
import java.util.Map;

class PhoneBook {
    private Map<String, String> contacts = new HashMap<>();

    public PhoneBook() {
        contacts.put("Alice", "555-1111");
        contacts.put("Bob", "555-2222");
    }

    public static void main(String[] args) {
        PhoneBook phoneBook=new PhoneBook();
        System.out.println(phoneBook.removeContact("Alice","555-1111"));
        System.out.println(phoneBook.removeContact("Bob","000-0000"));
        System.out.println(phoneBook.getContacts());

    }

    public  boolean removeContact(String name, String number) {
        return contacts.remove(name, number);
    }

    public  Map<String, String> getContacts() {
        return contacts;
    }
}