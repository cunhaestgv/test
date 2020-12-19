import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClient {
    @Test
    public void testClientState(){
        Client c = new Client();
        assertEquals(c.getname(),"XPTO2");
    }
}
