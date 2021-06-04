var milimetros: Double = 0.0
var centimetros: Double = 0.0
var metros: Double = 0.0
var kilometros: Double = 0.0

fun main(){
    var opcion=0

    println("Convertidor de unidades de Medida")
    println("1 = Milimetros a Centimetro")
    println ("2 = Milimetros a Metros")
    println ("3 = Milimetros a Kilometros")
    println ("4 = Centimetros a Milimetros")
    println ("5 = Metros  a Milimetros")
    println ("6 = Kilometros  a Milimetros")
    println("Seleccione una de las opciones")
    opcion = readLine()!!.toInt()

    if (opcion == 1){
        println("¿Introduzca La Cantidad de Milimetros que decea  convertir a centimetros?")
        milimetros = readLine()!!.toDouble()
        val centimetros = milimetros / 10.0
        println(" $milimetros  milimetros son  $centimetros  centimetros")

    }
    else if  (opcion ==2)
    {
        println("¿Introduzca La Cantidad de Milimetros que decea convertir a metros?")
        milimetros = readLine()!!.toDouble()
        val metros = milimetros / 1000.0
        println(" $milimetros  milimetros son  $metros  metros")
    }
    else if  (opcion ==3)
    {
        println("¿Introduzca La Cantidad de Milimetros que decea convertir a kilometros?")
        milimetros = readLine()!!.toDouble()
        val kilometros = milimetros / 1000000.0
        println(" $milimetros  milimetros son  $kilometros  kilometros")
    }
    else if  (opcion ==4)
    {
        println("¿Introduzca La Cantidad de centimetros que decea convertir a Milimetros?")
        centimetros = readLine()!!.toDouble()
        val milimetros = centimetros / 0.10000
        println(" $centimetros  centimetros son  $milimetros  milimetros")
    }
    else if  (opcion ==5)
    {
        println("¿Introduzca La Cantidad de metros que decea convertir a Milimetros?")
        metros = readLine()!!.toDouble()
        val milimetros = metros / 0.0010000
        println(" $metros  metros son  $milimetros  milimetros")
    }
    else if  (opcion ==6)
    {
        println("¿Introduzca La Cantidad de kilometros que decea convertir a Milimetros?")
        kilometros = readLine()!!.toDouble()
        val milimetros = kilometros / 0.00000100006
        println(" $kilometros  kilometros son  $milimetros  milimetros")
    }
    else
        println("Ingrese un numero que sea correcto por favor")
}