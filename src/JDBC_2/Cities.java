package JDBC_2;

public class Cities {
    int id;
    String name;

    public Cities(){

    }
    public Cities (int id, String name){
        this. id = id;
        this. name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cities{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
