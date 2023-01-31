package Smartphone;

import java.util.List;

public class Smartphone implements Radio, GPS {
    private String modelName;
    private String brandName;
    private List<Friend> contactList;

    @Override
    public String getPosition() {
        return null;
    }

    @Override
    public boolean startRadio() {
        return false;
    }

    @Override
    public boolean stopRadio() {
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
}
