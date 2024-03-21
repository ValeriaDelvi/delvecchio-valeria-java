package lezione7.liste;

public class Nil extends List{
    @Override
    public int add(int n) {
        return n;
    }

    @Override
    public int get(int n) {
        return 0;
    }

    @Override
    public int length() {
        return 0;
    }
}
