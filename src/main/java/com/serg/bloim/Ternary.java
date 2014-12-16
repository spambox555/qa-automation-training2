package com.serg.bloim;

/**
 * @author sergey.belonozhko@hp.com
 */
public class Ternary
{
    private int temp()
    {
        return true ? null : 0;  // No compiler error - the compiler allows a return value of null in a method signature that returns an int.
    }

    private int same()
    {
        if(true)
        {
            System.out.println("crash the system");
//            return null;  // The same is not possible with if, and causes a compile-time error - incompatible types.
        }
        else
        {
            return 0;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Ternary m=new Ternary();
        System.out.println(m.temp());
        System.out.println(m.same());
    }
}
