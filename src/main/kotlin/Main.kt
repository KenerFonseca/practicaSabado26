fun main(args: Array<String>) {


    val nuevo:ArrayList<Any> = ArrayList()

    for (d in 1..2)
    {
        println("Ingrese numero")
        var numero = readln()
        var numero2 = 2


        var result = numero + numero2

        nuevo.add(result)
    }

    for (d in 0 until nuevo.size)
    {
        println("$d numero: ${nuevo.get(d)}")
    }

}