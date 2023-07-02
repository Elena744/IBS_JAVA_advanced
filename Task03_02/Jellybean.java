public class Jellybean extends Sweets{
    private boolean sugar;

    public Jellybean(String name, int weight, int price, boolean sugar) {
        super(name, weight, price);
        this.sugar = sugar;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    @Override
    public String toString(){
        return "Jellybean: " + super.toString() + "; sugar = " + sugar;
    }
}
