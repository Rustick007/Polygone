package Variants

class CoVariance {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val l1: MutableList<Any> = mutableListOf(1234) //будет использзоваться для добавления в него
            val l2 = mutableListOf("Zdes' stroka") //будетиспользоваться для чтения

            addAll(l1,l2)

            print(l1)
        }

        fun <T> addAll(list1: MutableList<T>,
                       list2: MutableList<out T>){
            for(elem in list2) list1.add(elem)

        }
    }
}




