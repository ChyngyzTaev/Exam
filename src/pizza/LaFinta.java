package pizza;

public class LaFinta extends Pizza{
    private String souce;
    private boolean withMushrooms;
    private String whatGreenery;

    public LaFinta() {
    }

    public LaFinta(String whatGreenery,  String souce) {
        this.whatGreenery = whatGreenery;
        this.souce = souce;

    }

    @Override
    public String toString() {
        if (getAddressOfOrder()!= null){
            return "Название: LaFinta" + "\nЦена: " + getPrice() + "\nВес: " + getWeight() + "\nНазвание соуса: " + souce + "\nНазвание зелени: " + whatGreenery +"\nНачать готовить: " + isCook();
        }else if (getTimeOfOrder() != null){
            return "Название: LaFinta" + "\nЦена. " + getPrice() + "\nВес. " + getWeight() + "\nНазвание соуса: " + souce + "\nНазвание зелени: "+ whatGreenery +"\nНачать готовить: " + isCook();
        }else {
            return "Название: LaFinta" + "\nЦена. " + getPrice() + "\nВес. " + getWeight() + "\nНазвание соуса: " + souce +"\nНазвание зелени : "+whatGreenery+ "\nНачать готовить: " + isCook();
        }
    }

    public String getSouce() {
        return souce;
    }

    public void setSouce(String souce) {
        this.souce = souce;
    }

    public boolean isWithCheese() {
        return withMushrooms;
    }

    public void setWithCheese(boolean withCheese) {
        this.withMushrooms = withCheese;
    }

    public String getWhatGreenery() {
        return whatGreenery;
    }

    public void setWhatGreenery(String whatGreenery) {
        this.whatGreenery = whatGreenery;
    }
}
