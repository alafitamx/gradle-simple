import com.alafita.gradlesample.Hello;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    public void tester() {
        Assertions.assertNotNull(Hello.GREETING);
    }
}
