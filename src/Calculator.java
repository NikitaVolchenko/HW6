public class Calculator {

    public static class Add implements ICalculate {
        @Override
        public int calc(int x, int y) {
            return x + y;
        }
    }

    public static class Sub implements ICalculate {
        @Override
        public int calc(int x, int y) {
            return x - y;
        }
    }

    public static class Mult implements ICalculate {
        @Override
        public int calc(int x, int y) {
            return x * y;
        }
    }

    public static class Div implements ICalculate {
        @Override
        public int calc(int x, int y) {
            return x / y;
        }
    }
}
