package lezione7.liste;

public  class Node extends List{
    private int value;
    private List next;

    public Node(int value, List next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public int add(int n) {
        if (next instanceof Nil) {
            //  this.next = new Node(n, new Nil());
            next = new Node(n, next);
        }//endif
        else {
            //return next.add(n);

            next.add(n);
        }//end else

        return 0;
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
