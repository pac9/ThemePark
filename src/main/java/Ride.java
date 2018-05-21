public abstract class Ride {

    private int price;
    private int minimumAge;
    private int minimumHeight;

    public Ride(int price, int minimumAge, int minimumHeight) {
        this.price = price;
        this.minimumAge = minimumAge;
        this.minimumHeight = minimumHeight;
    }

    public int getPrice() {
        return this.price;
    }

    public int getMinimumAge() {
        return this.minimumAge;
    }

    public int getMinimumHeight(){
        return this.minimumHeight;
    }


}
