/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folder;

public class MaisConYelo extends Ice {
    @Override
    public void statusOfIce() {
        System.out.println("The ice for Mais Con Yelo has been melted");
    }

    void setIngredients() {
        this.ing1 = "Mais";
        this.ing2 = "Condensed Milk";
        this.priceIng1 = 3;
        super.otherIng();
    }

    void setBill1() {
        this.priceIng3 = 9;
        this.priceIng4 = 2;
        this.priceIng1 = priceIng1 + priceIng2+ priceIng3+ priceIng4;
    }

    void setBill() {
        this.priceIng1 = 10;
        this.priceIng2 = 10;
        this.priceIng3 = 5;
        setBill();
    }
    void setBill(int d) {
        setBill1();
    }

    public void stock() {
        System.out.println("No more stocks for Mais Con Yelo");
        System.out.println("-Nanno");
    }


}
