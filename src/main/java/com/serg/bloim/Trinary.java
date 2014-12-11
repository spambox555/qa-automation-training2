package com.serg.bloim;

/**
 * @author sergey.belonozhko@hp.com
 */
public class Trinary
{
    private int temp()
    {
        return true ? null : 0;  // No compiler error - the compiler allows a return value of null in a method signature that returns an int.
    }

    private int same()
    {
        if(true)
        {
            return null;  // The same is not possible with if, and causes a compile-time error - incompatible types.
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args)
    {
        Trinary m=new Trinary();
        System.out.println(m.temp());
        System.out.println(m.same());
    }
}
