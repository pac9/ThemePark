public class FerrisWheel extends Ride implements IPayment, IHeight{

    private int income;

    public FerrisWheel(int price, int minimumAge, int minimumHeight, int income) {
        super(price, minimumAge, minimumHeight);
        this.income = income;
    }

    public int income(int price){
        return income += price;
    }

    public boolean rideHeight(int height){
        if (height < getMinimumHeight());{
            return true;
        }
    }
}
