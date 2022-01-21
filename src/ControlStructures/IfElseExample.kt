package ControlStructures

class IfElseExample {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val  a: Int=3
            val b: Int=9
            val c: Int = if (a>b){
                a
            }
            else{
                b
            }
            println(c)
        }
    }
}