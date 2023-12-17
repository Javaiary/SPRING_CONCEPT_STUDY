package com.exam1.coffee;

public class ApplicationContextMain {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ApplicationContext();
        context.getBean("coffee");

        Coffee americano = (Coffee) context.getBean2("coffee");
        americano.setMilk(false);
        americano.setPrice(5000);

        System.out.println("americano : " + americano.getMilk());
        System.out.println("---------------------------");

        Coffee latte = (Coffee) context.getBean2("coffee");
        System.out.println("latte : " + latte.getMilk());

        if (americano==latte){
            System.out.println("same Instance");
        }else {
            System.out.println("different Instance");
        }

        System.out.println("====================================\n");

        Coffee americano2 = (Coffee) context.getBean3("coffee");
        americano2.setMilk(false);
        americano2.setPrice(5000);

        System.out.println("americano2 : " + americano2.getMilk());
        System.out.println("---------------------------");

        Coffee latte2 = (Coffee) context.getBean3("coffee");
        System.out.println("latte2 : " + latte2.getMilk());

        if (americano2==latte2){
            System.out.println("same Instance");
        }else {
            System.out.println("different Instance");
        }
    }
}
