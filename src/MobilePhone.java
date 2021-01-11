/*

holds array list of contacts


 */


import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        // return true if contact doesn't exist
        int exists = findContact(contact.getName());
        if (exists < 0){
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact old, Contact newContact){
        // return true if contact exists and was updated
        int exists = findContact(old);

        if (exists >= 0){
            myContacts.set(exists,newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact){
        // return true if contact exists and is removed
        int exists = findContact(contact);

        if (exists >= 0){
            myContacts.remove(exists);
            return true;
        }
        return false;
    }

    public int findContact(Contact contact){
        // return index of contact or -1
        return myContacts.indexOf(contact);
    }

    public int findContact(String name){
        // return index of contact
        for (int i=0; i< myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(name)){
                return i;
            }
        }

        return -1;
    }

    public Contact queryContact(String name){
        // find + return contact based off name.
        int avail = findContact(name);
        if (avail >= 0){
            return myContacts.get(avail);
        }
        return null;
    }
    public void printContacts(){
        // prints contacts (name -> number)
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++){
            System.out.println((i + 1) + ". " + myContacts.get(i).getName() + " -> " + myContacts.get(i).getPhoneNumber());
        }
    }
}
