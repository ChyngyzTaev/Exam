package pizza;

public class Pepperoni extends Pizza {
    private String whatSausage;
    private boolean withPaperOrNot;

    @Override
    public String toString() {
        if (getAddressOfOrder()!= null){
            return "Название: Pepperoni" + "\nЦена: " + getPrice() + "\nВес: " + getWeight() + "\nНазвание соуса: " + whatSausage+  "\nНачать готовить: " + isCook();
        }else if (getTimeOfOrder() != null){
            return "Название: Pepperoni" + "\nЦена: " + getPrice() + "\nВес: " + getWeight() + "\nНазвание соуса: " + whatSausage +"\nНачать готовить: " + isCook();
        }else {
            return "Название: Pepperoni" + "\nЦена: " + getPrice() + "\nВес: " + getWeight() + "\nНазвание соуса: " + whatSausage + "\nНачать готовить: " + isCook();
        }

    }

    public String getMeat() {
        return whatSausage;
    }

    public void setMeat(String whatPaper) {
        this.whatSausage = whatPaper;
    }

    public boolean isWithPaperOrNot() {
        return withPaperOrNot;
    }

    public void setWithPaperOrNot(boolean withPaperOrNot) {
        this.withPaperOrNot = withPaperOrNot;
    }
}
