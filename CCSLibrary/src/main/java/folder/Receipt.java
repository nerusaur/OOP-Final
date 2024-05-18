/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folder;

public class Receipt extends MaisConYelo {
    public void setData(String a, int b, String c, int d) {
        this.person = "Nobita";
        this.quantity = b;
        this.type = c;
        this.payment = d;
        this.data1 = 1;
    }

    public void setData(String a, int b, String c, int d, int e) {
        this.person = "Spongebob";
        this.quantity = b;
        this.type = c;
        this.payment = d;
        this.data1 = e;
    }

    public Receipt(String a, int b, String c, int d, int e) {
        if (b - d > 0) {
            setData(a, b, c, d, e);
        } else {
            setData(a, b, c, d);
        }
    }

    public Receipt(String a, int b, boolean c, int d) {
        statusOfIce();
        System.out.println("It Melts");
        System.out.println("Goodbye");
        System.exit(0);
    }

    void calculate() {
        if (person.equalsIgnoreCase("Senior Citizen")) {
            discount = 30;
        } else if (person.equalsIgnoreCase("Regular")) {
            discount = 20;
        } else {
            discount = 50;
        }

        if (type.equalsIgnoreCase("Small")) {
            discount = discount + 10;
        } else if (type.equalsIgnoreCase("Medium")) {
            discount = discount + 20;
        } else {
            discount = 50;
        }

        total = (priceIce + priceIng1) * quantity - discount;
        change = payment - total;
    }

    void dataCost() {
        System.out.println("TOTAL ICE COST Discounted:" + super.getIce());
        System.out.println("TOTAL INGREDIENT COST:" + priceIng1);
    }

    void dataPerson() {
        if (person.equalsIgnoreCase("Regular")) {
            System.out.println("COSTUMER:" + person1);
        } else {
            System.out.println("COSTUMER:" + person);
        }
    }

    void dataComputation() {
        calculate();
        System.out.println("DISCOUNT:" + discount);
        System.out.println("TOTAL:" + total);
        System.out.println("PAYMENT:" + payment);
        System.out.println("CHANGE:" + change);
    }

    public static void main(String[] args) {
        Receipt customer1 = new Receipt("Regular", -2, "Small", 500, 2);
        customer1.setBill();
        customer1.setIngredients();
        customer1.dataCost();
        customer1.dataComputation();
        customer1.dataPerson();

        Receipt customer2 = new Receipt("Regular", 3, "Medium", 1000, -1);
        customer2.setBill();
        customer2.setIngredients();
        customer2.dataPerson();
        customer2.dataCost();
        customer2.dataComputation();
    }
}