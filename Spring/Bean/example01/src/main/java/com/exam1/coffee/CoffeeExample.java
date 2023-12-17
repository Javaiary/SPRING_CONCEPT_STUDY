package com.exam1.coffee;

public class CoffeeExample {
    public static void main(String[] args) {
        Coffee vanillaLatte = new Coffee(true, "vanilla", 6000);
        //vanillaLatte 는 참조변수.
        //사용자가 직접 생성한 인스턴스

        System.out.println(vanillaLatte.getMilk());
        System.out.println(vanillaLatte.getSyrup());
        System.out.println(vanillaLatte.getPrice());

    }
}
