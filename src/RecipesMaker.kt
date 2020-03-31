import java.lang.IndexOutOfBoundsException
import java.lang.NumberFormatException
import java.text.NumberFormat

val listaIngredientes : List<String> =
    listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")


fun main() {

    do {
        showMenu()
        val resultadoTeclado : Int?  = readLine()?.toInt()
        when(resultadoTeclado)
        {
            1 -> hacerReceta()
            3 -> println("Hasta pronto!")
        }
    } while (resultadoTeclado != 3)

}

fun showMenu()
{
    println("Selecciona la opción deseada:")
    println("1. Hacer una receta")
    println("2. Ver mis recetas")
    println("3. Salir")
    println("Tu opción es:")
    println()
}

fun hacerReceta()
{
    println("A continuación se muestran los ingredientes disponibles: ")
    var contador = 1
    for (ingredientes in listaIngredientes)
    {
        println("$contador: $ingredientes")
        contador++
    }
    println()
    println("Seleccione el que desea añadir: ")
    val ingredienteSeleccionado = readLine()?.toInt()
    try {
        println("Elegiste:" )
        println(listaIngredientes[ingredienteSeleccionado!!-1])

    }catch (e: NullPointerException)
    {
        println("No se permiten valores null")
    }catch (e: IndexOutOfBoundsException)
    {
        println("Limitese a las opciones que le son brindadas")
    }catch (e: NumberFormatException)
    {
        println("Verifique el valor que desea ingresar")

    }


    println("Se volverá al menú principal:")

}