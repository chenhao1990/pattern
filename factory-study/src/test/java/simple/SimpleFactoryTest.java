package simple;

import com.study.factory.simple.factory.SimpleFactory;
import org.junit.Test;

public class SimpleFactoryTest {
    @Test
    public void test(){
        SimpleFactory.selectPerson("worker").behavior();

    }

}
