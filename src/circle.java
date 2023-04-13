public class circle extends  shapes {


    int radius;

    @Override
    public double calArea() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double calPeri() {
        return 3.14 * radius * radius;
    }
}
