package HRB;
import java.io.*;
//import java.util.*;

public class Food implements Serializable{
    private int item_no;
    private int quantity;
    private int price;

    Food(int item_no, int quantity){
        setItem_no(item_no);
        setQuantity(quantity);
        switch (item_no){
            case 1: setPrice(quantity * 100);
                break;
            case 2: setPrice(quantity * 130);
                break;
            case 3: setPrice(quantity * 150);
                break;
            case 4: setPrice(quantity * 60);
                break;

        }
    }

    public int getItem_no() {
        return item_no;
    }

    public void setItem_no(int item_no) {
        if(item_no <= 4)
            this.item_no = item_no;
        else
        {
            System.out.println("There is no item as " +item_no+ " in the list. Kindly Choose from the list.");

        }

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0)
            System.out.println("Quantity can not be less than or equal to 0. Add something please.");
        else
            this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}