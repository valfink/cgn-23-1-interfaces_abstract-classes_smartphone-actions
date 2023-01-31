package Smartphone;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BusinessContactTest {
    @Test
    void companyName() {
        // GIVEN
        BusinessContact c = new BusinessContact();
        String expected = "Test Company";

        // WHEN
        c.setCompanyName("Test Company");
        String result = c.getCompanyName();

        // THEN
        assertEquals(expected, result);
    }

    @Test
    void constructor_withData() {
        // GIVEN
        BusinessContact c = new BusinessContact("Valentin Finke", "0157 7424 7505", "Open For Work");
        String expected = "Open For Work";

        // WHEN
        String result = c.getCompanyName();

        // THEN
        assertEquals(expected, result);
    }

    @Test
    void constructor_empty() {
        // GIVEN
        BusinessContact c = new BusinessContact();

        // WHEN
        String result = c.getCompanyName();

        // THEN
        assertNull(result);
    }

    @Test
    void toString_test() {
        // GIVEN
        BusinessContact c = new BusinessContact("Valentin Finke", "0157 7424 7505", "Open For Work");
        String expected = "BusinessContact{companyName='Open For Work', telNumber='0157 7424 7505', name='Valentin Finke'}";

        // WHEN
        String result = c.toString();

        // THEN
        assertEquals(expected, result);
    }

}
