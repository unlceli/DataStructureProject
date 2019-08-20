package com.example.datastructureproject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

/**
 * 数据结构 + 算法 = 程序
 *
 * 程序的好坏= 空间复杂度 + 时间复杂度 + 应用场景（重要）
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    /**
     * 交换位置
     */
    @Test
    public void testSwap(){
        int a = 5;
        int b = 6;
        //第一种，使用可读性最好的。
//        int t = a ;
//        a = b ;
//        b = t ;

        //第二种
//        a = a + b ;
//        b = a - b ;
//        a = a - b ;

        //第三种,性能最优，但是可读性不好。  用于无人机，跑步机，车载系统等。
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " +a  + "b = " + b);
    }
}