package my.example.com.kotlinweather.testdemo

import junit.framework.Assert.*

/**
 * Created by ccg on 2018/8/2.
 */
class Test005 {
    fun test() {
        val list = listOf(1, 2, 3, 4, 5, 6)

        //any
        //如果至少有一个元素符合给出的判断条件，则返回true。
        assertTrue(list.any { it % 2 == 0 })
        assertFalse(list.any { it > 10 })

        //all
        //如果全部的元素符合给出的判断条件，则返回true。
        assertTrue(list.all { it < 10 })
        assertFalse(list.all { it % 2 == 0 })

        //count
        //返回符合给出判断条件的元素总数。
        assertEquals(3, list.count { it % 2 == 0 })

        //fold
        //在一个初始值的基础上从第一项到最后一项通过一个函数累计所有的元素。
        assertEquals(25,list.fold(4){total,next->total+next})

        assertEquals(25,list.foldRight(4){total,next->total+next})

        list.forEach { println(it) }

        list.forEachIndexed { index, value -> println("position $index contains a $value")  }

        assertEquals(6,list.max())

        assertEquals(1,list.maxBy { -it })

        assertEquals(1,list.min())

        assertEquals(1,list.minBy { -it })

        assertTrue(list.none { it%7==0 })


    }
}