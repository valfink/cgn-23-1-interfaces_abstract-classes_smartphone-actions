package Smartphone;

import java.util.List;

public class Smartphone implements Radio, GPS {
    private String modelName;
    private String brandName;
    private List<Friend> contactList;

    public Smartphone() {
    }

    public Smartphone(String modelName, String brandName, List<Friend> contactList) {
        this.modelName = modelName;
        this.brandName = brandName;
        this.contactList = contactList;
    }

    @Override
    public String getPosition() {
        return new String("Berlin-Wilmersdorf");
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

    public void setContactList(List<Friend> contactList) {
        this.contactList = contactList;
    }

    public List<Friend> getContactList() {
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
}
