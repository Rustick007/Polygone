package Variants

class ContrVariance {

    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val l1: MutableList<Any> = mutableListOf(1234)
            val l2 = mutableListOf("вот эта строка будет для чтения, ее метод addAll запишет в l1")

            addAll(l1,l2)
            println(l1)
        }
        fun<T> addAll(list1: MutableList<in T>,
                      list2: MutableList<T>){
            for(elem in list2){
                list1.add(elem)
            }
        }
    }

}