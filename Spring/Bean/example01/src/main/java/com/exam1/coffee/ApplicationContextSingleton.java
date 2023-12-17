package com.exam1.coffee;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
//싱글톤 패턴
public class ApplicationContextSingleton {
    // 1.자기 자신을 참조하는 static 필드 선언
    private static ApplicationContextSingleton instance  = new ApplicationContextSingleton();

    Properties props;
    Map objectMap;

    // 2. private 생성자
    private
    ApplicationContextSingleton() {
        props = new Properties();
        objectMap = new HashMap<String,Object>();
        try {
            props.load(new FileInputStream("src/main/resources/Beans.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // 3. 1에서 만든 인스턴스를 반환하는 static 메소드 작성
    public static ApplicationContextSingleton getInstance(){
        return instance;
    }
    public Object getBean(String id) throws ClassNotFoundException {
        String className =  props.getProperty(id);

        // class 정보 가져오기 (class name 문자열을 이용해 인스턴스 생성 가능!!)
        Class clazz= Class.forName(className);

        //clazz가 가지고 있는 메서드들을 가져옴
        for (Method method : clazz.getMethods()) {
            System.out.println(method.getName());
        }

        return null;
    }

    public Object getBean2(String id ) throws Exception {
        String className = props.getProperty(id);
        Class clazz = Class.forName(className);

        //ClassLoader를 이용한 인스턴스 생성
        Object o = clazz.newInstance(); //clazz 정보를 이용하여 인스턴스 생성
        return o;
    }

    public Object getBean3(String id ) throws Exception {
        Object o1 = objectMap.get(id);
        if (o1 ==null){
            String className = props.getProperty(id);
            Class clazz = Class.forName(className);

            Object o = clazz.newInstance();
            objectMap.put(id,o);
            o1=objectMap.get(id);
        }
        return o1;
    }
}
