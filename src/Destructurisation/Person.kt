package Destructurisation

import java.time.Instant

data class Person(val name: String, val registered: Instant = Instant.now()) {

    companion object {

        fun show(persons: List<Person>){
            for((name,date) in persons)
                println(name + "'s registration date: " + date)
        }


        // другой вариант написания метода show c использованием component
        fun show1(persons: List<Person>){
            for (person in persons){
                println(person.component1() + "'s registration date:" + person.component2())
            }
        }




        @JvmStatic
            fun main(args: Array<String>){
            val persons = listOf(Person("Mike"), Person("Paul"))
            show(persons)

            println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")

            show1(persons)


            }
    }
}