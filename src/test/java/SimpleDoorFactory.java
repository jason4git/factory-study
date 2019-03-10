import com.gupao.factory.IDoor;
import com.gupao.factory.SecurityDoor;
import com.gupao.factory.WoodenDoor;
import com.gupao.factory.simplefactory.DoorFactory;
import org.junit.Test;

public class SimpleDoorFactory {
    @Test
    public void test(){
        DoorFactory factory= new DoorFactory();
        IDoor door = factory.create(WoodenDoor.class);
        door.open();
    }
}
