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
        println("Error de nulos")
    }catch (e: IndexOutOfBoundsException)
    {
        println("Error de index out of bounds")
    }catch (e: NumberFormatException)
    {
        println("Error de number format")
    }


    println("Se volverá al menú principal:")

}