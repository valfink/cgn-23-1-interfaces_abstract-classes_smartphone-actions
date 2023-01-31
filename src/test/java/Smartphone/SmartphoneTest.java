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

    @Test
    void startRadio() {
        // GIVEN
        Smartphone p = new Smartphone();

        // WHEN
        boolean result = p.startRadio();

        // THEN
        assertTrue(result);
    }

    @Test
    void stopRadio() {
        // GIVEN
        Smartphone p = new Smartphone();

        // WHEN
        boolean result = p.stopRadio();

        // THEN
        assertFalse(result);
    }

    @Test
    void getPosition() {
        // GIVEN
        Smartphone p = new Smartphone();
        String expected = "Berlin-Wilmersdorf";

        // WHEN
        String result = p.getPosition();

        // THEN
        assertEquals(expected, result);
    }

    @Test
    void constructor_withData() {
        // GIVEN
        List<Friend> contactList = new ArrayList<>();
        contactList.add(new Friend("Valentin Finke", "0157 7424 7505"));
        Smartphone p = new Smartphone("Newest Phone", "Ikea", contactList);
        String expected = "Newest Phone";

        // WHEN
        String result = p.getModelName();

        // THEN
        assertEquals(expected, result);
    }

    @Test
    void constructor_empty() {
        // GIVEN
        Smartphone p = new Smartphone();

        // WHEN
        String result = p.getModelName();

        // THEN
        assertNull(result);
    }

    @Test
    void testToString() {
        // GIVEN
        List<Friend> contactList = new ArrayList<>();
        contactList.add(new Friend("Valentin Finke", "0157 7424 7505"));
        contactList.add(new Friend("Gleb Abramov", "123 456 789"));
        contactList.add(new Friend("Alaa Jouri", "012 345 678"));
        contactList.add(new Friend("Lena Ruppert", "234 567 890"));
        Smartphone p = new Smartphone("Newest Phone", "Ikea", contactList);
        String expected = "Smartphone{modelName='Newest Phone', brandName='Ikea', contactList=[Friend{telNumber='0157 7424 7505', name='Valentin Finke'}, Friend{telNumber='123 456 789', name='Gleb Abramov'}, Friend{telNumber='012 345 678', name='Alaa Jouri'}, Friend{telNumber='234 567 890', name='Lena Ruppert'}]}";

        // WHEN
        String result = p.toString();

        // THEN
        assertEquals(expected, result);
    }

}
