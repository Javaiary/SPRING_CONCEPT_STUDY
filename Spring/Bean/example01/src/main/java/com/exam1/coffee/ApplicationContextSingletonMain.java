package com.exam1.coffee;

public class ApplicationContextSingletonMain {
    public static void main(String[] args) {
        // 4. 3으로부터 1의 인스턴스를 가져옴
        ApplicationContextSingleton context = ApplicationContextSingleton.getInstance();
        ApplicationContextSingleton context2 = ApplicationContextSingleton.getInstance();

        if(context == context2){
            System.out.println("같음");
        }
    }
}
