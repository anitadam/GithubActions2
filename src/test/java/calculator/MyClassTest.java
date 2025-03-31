package calculator;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClassTest {

    @Test
    public void addTest()
    {
        MyClass myClass = new MyClass();

        assertEquals(3, myClass.add(1,2));
        assertEquals(5,myClass.add(2,3));
        assertEquals(10,myClass.add(2,8));

    }
    @Test
    public void subTest()
    {
        MyClass myClass = new MyClass();

        assertEquals(1, myClass.sub(2,1));
        assertEquals(5,myClass.sub(10,5));
        assertEquals(10,myClass.sub(20,10));

    }



}
