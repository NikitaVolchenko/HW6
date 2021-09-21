public class CommanExecutor {

    public class Add implements IOperation {

        @Override
        public int calc(int x, int y) {
            return x + y;
        }
    }

    public class Sub implements IOperation {

        @Override
        public int calc(int x, int y) {
            return x - y;
        }
    }

    public class Mult implements IOperation {

        @Override
        public int calc(int x, int y) {
            return x * y;
        }
    }

    public class Div implements IOperation {

        @Override
        public int calc(int x, int y) {
            return x / y;
        }
    }

    public int execute(int x, int y, IOperation iOperation) {
        return iOperation.calc(x, y);
    }

}
