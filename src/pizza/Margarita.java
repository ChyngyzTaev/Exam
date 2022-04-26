package pizza;

public class Margarita extends Pizza{
    private String whatMeat;
    private boolean withMeatOrNot;

    @Override
    public String toString() {
        if (getAddressOfOrder()!= null){
            return "Название: Margarita" + "\nЦена: " + getPrice() + "\nВес: " + getWeight() + "\nКакое мясо: " + whatMeat +"\nНачать готовить: " + isCook();
        }else if (getTimeOfOrder() != null){
            return "Название: Margarita" + "\nЦена: " + getPrice() + "\nВес: " + getWeight() + "\nКакое мясо: " + whatMeat +"\nНачать готовить: " + isCook();
        }else {
            return "Название: Margarita" + "\nЦена: " + getPrice() + "\nВес: " + getWeight() + "\nКакое мясо: " + whatMeat + "\nНачать готовить: " + isCook();
        }
    }

    public String getWhatMeat() {
        return whatMeat;
    }

    public void setWhatMeat(String whatMeat) {
        this.whatMeat = whatMeat;
    }

    public boolean isWithMeatOrNot() {
        return withMeatOrNot;
    }

    public void setWithMeatOrNot(boolean withMeatOrNot) {
        this.withMeatOrNot = withMeatOrNot;
    }
}
