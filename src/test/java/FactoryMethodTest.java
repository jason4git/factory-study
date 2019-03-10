import com.gupao.factory.IDoor;
import com.gupao.factory.factorymethod.IDoorFactory;
import com.gupao.factory.factorymethod.SecurityDoorFactory;
import com.gupao.factory.factorymethod.WoodenDoorFactory;
import org.junit.Test;

public class FactoryMethodTest {
    @Test
    public void test(){
        IDoorFactory factory = new SecurityDoorFactory();
        IDoor door = factory.create();
        door.open();

        IDoorFactory woodDoorFactory = new WoodenDoorFactory();
        IDoor woodenDoor = woodDoorFactory.create();
        woodenDoor.open();
    }
}
