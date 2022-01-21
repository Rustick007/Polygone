package functions


import java.lang.Math.pow
import kotlin.math.abs
import kotlin.math.sqrt

class Ex_3_1 {

    companion object{
        @JvmStatic
        fun main(args: Array<String>){


        }
    }
    fun compose(f: (Int)->Int, g:(Int)->Int): (Int) -> (Int)={f(g(it))}



}