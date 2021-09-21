public class Sequence {

    private Object[] arr;

    Sequence(int length) {
        arr = new Object[length];
    }

    public Object[] getArr() {
        return arr;
    }

    public void setArr(Object[] arr) {
        this.arr = arr;
    }

    public class Selector {

        private int i;

        Selector(int i) {
            this.i = i;
        }

        public Object current() {
            return arr[i];
        }

        public int next() {
            i += 1;
            return i;
        }

        public boolean end() {
            return i < arr.length;
        }
    }
}
