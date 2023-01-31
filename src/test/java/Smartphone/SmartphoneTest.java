package Smartphone;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SmartphoneTest {
    @Test
    void modelName() {
        // GIVEN
        Smartphone p = new Smartphone();
        p.setModelName("Newest Phone");
        String expected = "Newest Phone";

        // WHEN
        String result = p.getModelName();

        // THEN
        assertEquals(expected, result);
    }

    @Test
    void brandName() {
        // GIVEN
        Smartphone p = new Smartphone();
        p.setBrandName("Ikea");
        String expected = "Ikea";

        // WHEN
        String result = p.getBrandName();

        // THEN
        assertEquals(expected, result);
    }

    @Test
    void contactList() {
        // GIVEN
        Smartphone p = new Smartphone();
        List<Friend> contactList = new ArrayList<>();
        contactList.add(new Friend("Valentin Finke", "0157 7424 7505"));
        p.setContactList(contactList);
        List<Friend> expected = contactList;

        // WHEN
        List<Friend> result = p.getContactList();

        // THEN
        assertEquals(expected, result);
    }

}
