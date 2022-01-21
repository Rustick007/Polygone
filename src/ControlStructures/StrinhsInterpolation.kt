package ControlStructures

class StrinhsInterpolation {

    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val name = "Rustam"
            val date = 10
            println("$name's car registration date: $date" )


            println("""This is the first line 
                |and this is the second one
            """.trimMargin())


        }

    }



}
