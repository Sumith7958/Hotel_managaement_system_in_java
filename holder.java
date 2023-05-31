package HRB;
import java.io.Serializable;

class holder implements Serializable {

    DoubleRoom[] drl = new DoubleRoom[10]; // Luxury Double Room.... 1-10
    DoubleRoom[] drd = new DoubleRoom[20]; // Deluxe Double Room.....11-30
    SingleRoom[] srl = new SingleRoom[10]; // Luxury Single Room.....31-40
    SingleRoom[] srd = new SingleRoom[20]; // Deluxe Single Room.....41-60
}