import java.text.SimpleDateFormat
import java.util.Date

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
    println("-----------")

    //&& 12 ||

    var tienePermiso = true

    if (( edad> 18 ||  tienePermiso))
    {
        println("Puede ir a la fiesta")
    }
    else
    {
        println("no puede ir a la fiestaa")
    }
    var dateF = SimpleDateFormat("EEEE" )
    var fechaActual = Date()
    var diaDelaSemana = dateF.format(fechaActual)
    println(diaDelaSemana)

    when(diaDelaSemana)
    {
        "lunes"-> println("Hoy es ${diaDelaSemana}")
        "Martes"-> println("Hoy es ${diaDelaSemana}")
        "Miercoes"-> println("Hoy es ${diaDelaSemana}")
        "Jueves"-> println("Hoy es ${diaDelaSemana}")
        "Viernes"-> println("Hoy es ${diaDelaSemana}")
        "Sabado"-> println("Hoy es ${diaDelaSemana}")
        "Domingo"-> println("Hoy es ${diaDelaSemana}")
        else -> println("Incorrecto....")
    }

    // FOR

    for (n in 'a'..'z')
    {
        println("$n" )
    }


    var MisNumerosDeLaSuerte = arrayOf(1,2,3,4,5)

    for (elemn in MisNumerosDeLaSuerte){
        println("Los elementos : $elemn")
    }


}