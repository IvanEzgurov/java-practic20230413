package HomeWork6;

import java.util.ArrayList;
import java.util.List;

public class Notebook {

    private String name;
    private int amountRam;
    private String operatingSystem;
    private int price;
    private String model;

    public Notebook(String name, int amountRam, String operatingSystem, int price, String model){
        this.name = name;
        this.amountRam = amountRam;
        this.operatingSystem = operatingSystem;
        this.price = price;
        this.model = model;
    }
    public boolean validateObject(){
        return true;
    }

    public static List<String> propertiesForFilter(){
        List<String> list = new ArrayList<>();
        list.add("amountRam");
        list.add("operatingSystem");
        list.add("price");
        list.add("model");

        return list;
    }

    @Override
    public String toString() {
        return "Ноутбук: (" + name + "): " +
                "оперативная память: " + amountRam +
                ", операционная система: " + operatingSystem + '\'' +
                ", цена: " + price +
                ", модель: " + model;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAmountRam(){
        return amountRam;
    }

    public void setAmountRam(int amountRam){
        this.amountRam = amountRam;
    }
    public String getOperatingSystem(){
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem){
        this.operatingSystem = operatingSystem;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

}
