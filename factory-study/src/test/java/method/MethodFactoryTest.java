package method;

import com.study.factory.method.MethodFactory;
import com.study.factory.method.WorkerFactory;
import org.junit.Test;

public class MethodFactoryTest {
    @Test
    public void test(){
        MethodFactory factory = new WorkerFactory();
        factory.getPerson().behavior();

    }
}
