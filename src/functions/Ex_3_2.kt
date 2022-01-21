package functions

class Ex_3_2 {

    companion object{
        @JvmStatic
        fun main(args: Array<String>){

        }
    }
    // полиморфная функция
    fun<T,U,V> compose(f: (U)->V, g:(T)->U): (T) -> (V)={f(g(it))}

}