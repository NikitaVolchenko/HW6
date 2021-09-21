public class Main1 {

    public static void main(String[] args) {

        Phone phone = new Phone.Builder()
                .setColor("black")
                .setName("IPhone")
                .setSize(20)
                .setCost(100000)
                .build();

        System.out.println(phone);

        Phone phone1 = new Phone.Builder()
                .setColor("white")
                .setName("Samsung")
                .setSize(20)
                .setCost(50000)
                .build();

        System.out.println(phone1);
    }
}
