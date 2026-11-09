import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAddition() {
        App app = new App();
        assertEquals(10, app.add(5, 5));
    }

    @Test
    public void testAnotherAddition() {
        assertEquals(20, App.add(10, 10));
    }
}
