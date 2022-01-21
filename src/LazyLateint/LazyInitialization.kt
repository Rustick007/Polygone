package LazyLateint

class LazyInitialization {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val name: String by lazy { getname() }

            println("hey1")
            val name2: String by lazy { name }
            println("hey2")
            println(name)
            println(name2)
            println(name)
            println(name2)

        }

        fun getname(): String{
            println("Computing name...")
            return "Mickey"
        }

    }


}