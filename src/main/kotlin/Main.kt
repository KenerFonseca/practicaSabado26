fun main(args: Array<String>) {

   var edad =18
    if (edad >  18)
    {
        println("mayor")
    }else{
        println("no es mayor")
    }

var msj = if(edad>18)
    "mayor"
else "no es mayor"


    //OPERADORES LOGICOS
    //< > >= <= == != ?:
    //operador elvis ?:

    var x = null
    var y = 20
    var z = x ?: y //operacion de elvis Importante

    println(z)
}