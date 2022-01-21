package ControlStructures

class Cycles {

    companion object{
        @JvmStatic
        fun  main(args: Array<String>){
           for(i in 0 until 10)
               print("$i ")

            println()

           for(i in 0 until 10 step 2)
               print("$i ")

            println()


            val range = 0 until 10 step 2
            for(i in range) print("$i ")


        }

    }

}