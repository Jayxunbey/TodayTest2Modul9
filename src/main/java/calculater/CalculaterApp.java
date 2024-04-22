package calculater;

import java.util.stream.Stream;

public class CalculaterApp {

    public int sum(int a, int b) {
        return a + b;
    }

    public static class TestArguments {
        public  int a;
        public  int b;

        public TestArguments(int a, int b) {
            this.a = a;
            this.b = b;
        }

    }

    public  Stream<TestArguments> getStream(){
        return Stream.of(new TestArguments(3,5), new TestArguments(4,6), new TestArguments(5,7), new TestArguments(6,8));
    }

}
