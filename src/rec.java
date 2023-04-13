public class rec extends shapes {
    int l , w;

    @Override
    public double calArea() {
        return l * w;
    }

    @Override
    public double calPeri() {
        return l + l + w + w;
    }
}
