public class Main {

    public static void main(String[] args) {

        SomeClass someClass = new SomeClass();

        someClass.someMethod(new IPrint() {
            //реализация первого анонимного класса
        });

        someClass.someMethod(new IPrint() {
            //реализация второго анонимного класса
        });

        someClass.someMethod(new IPrint() {
            //реализация третьего анонимного класса
        });
    }
}
