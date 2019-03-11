package abs;

import com.study.factory.abs.AbsFactory;
import com.study.factory.abs.BreadFactory;
import com.study.factory.abs.bean.Food;
import org.junit.Test;

public class AbsFactoryTest {
    @Test
    public void test(){
        AbsFactory factory =new BreadFactory();
        Food food = factory.producFood();
        factory.wrapp();

    }
}
