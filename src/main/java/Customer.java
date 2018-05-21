public class Customer implements IPayment, IHeight{

    private int age;
    private int height;
    private int money;

    public Customer(int age, int height, int money){
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge(){
        return age;
    }

    public int getHeight(){
        return height;
    }

    public int getMoney(){
        return money;
    }

    public int income(int price) {
        return money -= price;
    }

    public boolean rideHeight(int height){
            if (height < getHeight());{
                return true;
            }
    }

}
