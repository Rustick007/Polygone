package ControlStructures

class SmartCast {

    companion object{
        @JvmStatic
        fun main(args: Array<String>){

            val payload = "sdfafds"

            val length: Int = if (payload is String){
                payload.length
            }
            else
            {
                -1
            }

            println(length)


            val result: Int = when(payload){

                is String -> payload.length
            //    is Int -> payload
                else -> -1


            }

            // для безопасности следует избегать as?,  а так же типы поддерживающие  null
            val result1: String? = payload as? String
        }


    }
}