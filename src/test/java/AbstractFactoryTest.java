import com.gupao.factory.abstractfactory.PanpanFactory;
import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void test(){
        PanpanFactory panpanFactory = new PanpanFactory();
        panpanFactory.createDoor().open();
        panpanFactory.createLock().lock();
    }
}
