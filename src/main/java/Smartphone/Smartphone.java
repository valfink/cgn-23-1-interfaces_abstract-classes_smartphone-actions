package Smartphone;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Radio, GPS {
    private String modelName;
    private String brandName;
    private List<Contact> contactList;

    public Smartphone() {
        this.contactList = new ArrayList<>();
    }

    public Smartphone(String modelName, String brandName, List<Contact> contactList) {
        this.modelName = modelName;
        this.brandName = brandName;
        this.contactList = contactList;
    }

    @Override
    public String getPosition() {
        return "Berlin-Wilmersdorf";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modelName='" + modelName + '\'' +
                ", brandName='" + brandName + '\'' +
                ", contactList=" + contactList +
                '}';
    }

    public void addContact(Contact contact) {
        contactList.add(contact);
    }

    public Contact getContact(int i) {
        return contactList.get(i);
    }

    public Contact getContactByName(String contactName) {
        for (Contact c : contactList) {
            if (c.getName().equals(contactName)) {
                return c;
            }
        }
        return null;
    }

    public Contact removeContactByName(String contactName) {
        for (Contact c : contactList) {
            if (c.getName().equals(contactName)) {
                contactList.remove(c);
                return c;
            }
        }
        return null;
    }
}
