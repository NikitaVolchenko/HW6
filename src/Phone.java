import java.util.Locale;

public class Phone {

    private String color;
    private String name;
    private int size;
    private int cost;

    Phone(String color, String name, int size, int cost) {
        this.color = color;
        this.name = name;
        this.size = size;
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", cost=" + cost +
                '}';
    }

    public static class Builder {

        private String color;
        private String name;
        private int size;
        private int cost;

        Builder() {
        }

        public Phone build() {
            return new Phone(color, name, size, cost);
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setCost(int cost) {
            this.cost = cost;
            return this;

        }
    }

}
