package Part3;

public class PhoneTest {
    public static void main(String[] args) {
        Phone Samsung = new Phone();
        Phone Iphone = new Phone();
        Phone Xiaomi = new Phone();
        Iphone.setNumber(937609889);
        Iphone.setModel("Iphone 13 Pro Max");
        Iphone.setWeight(0.4);
        Iphone.name = "Karoline";
        Samsung.setNumber(935643254);
        Samsung.setModel("S22 Ultra");
        Samsung.setWeight(0.5);
        Samsung.name = "Eva";
        Xiaomi.setNumber(992223450);
        Xiaomi.setModel("Xiaomi 11 Lite");
        Xiaomi.setWeight(0.7);
        Xiaomi.name = "Matilda";
        System.out.println(Samsung.getNumber() + " " + Samsung.getModel() + " " + Samsung.getWeight());
        System.out.println(Iphone.getNumber() + " " + Iphone.getModel() + " " + Iphone.getWeight());
        System.out.println(Xiaomi.getNumber() + " " + Xiaomi.getModel() + " " + Xiaomi.getWeight());

        Samsung.receiveCall();
        Iphone.receiveCall();
        Xiaomi.receiveCall();


    }
}
