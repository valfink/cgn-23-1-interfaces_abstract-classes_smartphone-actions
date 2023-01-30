package Smartphone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FriendTest {
    @Test
    void testName() {
        // GIVEN
        Friend f = new Friend();
        f.setName("Valentin Finke");
        String expected = "Valentin Finke";

        // WHEN
        String result = f.getName();

        // THEN
        assertEquals(expected, result);
    }

    @Test
    void testTelNumber() {
        // GIVEN
        Friend f = new Friend();
        f.setTelNumber("0157 7424 7505");
        String expected = "0157 7424 7505";

        // WHEN
        String result = f.getTelNumber();

        // THEN
        assertEquals(expected, result);
    }

    @Test
    void testConstructor_withData() {
        // GIVEN
        Friend f = new Friend("Valentin Finke", "0157 7424 7505");
        String expected = "0157 7424 7505";

        // WHEN
        String result = f.getTelNumber();

        // THEN
        assertEquals(expected, result);
    }

    @Test
    void testConstructor_empty() {
        // GIVEN
        Friend f = new Friend();
        String expected = null;

        // WHEN
        String result = f.getTelNumber();

        // THEN
        assertEquals(expected, result);
    }

    @Test
    void testToString() {
        // GIVEN
        Friend f = new Friend("Valentin Finke", "0157 7424 7505");
        String expected = "Friend{telNumber='0157 7424 7505', name='Valentin Finke'}";

        // WHEN
        String result = f.toString();

        // THEN
        assertEquals(expected, result);
    }
}
