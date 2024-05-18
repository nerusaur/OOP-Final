/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folder;

public class Ice {
    String mainIng;
    String ing1, ing2, ing3, ing4;
    int priceIng1, priceIng2, priceIng3, priceIng4;
    String ice;
    int priceIce;
    String person;
    String person1;
    String type;
    int discount;
    int quantity;
    int payment;
    int total;
    int change;
    int data1;
    int iceCost;
    
    public Ice() {
        this.mainIng = "Spongebob";
        this.person1 = "Patrick";
        if (data1 == 1) {
            this.ice = "crushed";
            this.priceIce = 10;
        } else {
            this.ice = "shaved";
            this.priceIce = 15;
        }
    }

    public void statusOfIce() {
        System.out.println("ICE IS COLD");
    }
int getIce(){
    iceCost = 10;
    return iceCost;
}
    public void otherIng() {
        this.ing3 = "Evaporated Milk";
        this.ing4 = "Corn Meal";
    }
}