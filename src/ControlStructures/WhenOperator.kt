package ControlStructures

class WhenOperator {

    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val country = "Tatarstan"
            val tired = false


            val capital = when{
                tired -> "Check for yourself"
                country == "Australia" -> "Canberra"
                country == "USA" -> "Washington"
                country == "Canada" -> "Ottava"
                country == "Tatarstan" -> "Kazan"
                country == "UAE" -> "Dubai"
                else -> "Unknown"
            }

            println(capital)


        }
    }

}