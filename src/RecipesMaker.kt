import java.lang.NumberFormatException

// Ejecución del programa mediante el menú principal
fun main() {
    do {
        showMenu()
        val resultadoTeclado : Int?  = readLine()?.toInt()
            when(resultadoTeclado) {
                1 -> hacerReceta()
                2 -> mostrarReceta()
                3 -> println("Hasta pronto!")
            }
        println()
    } while (resultadoTeclado != 3)
}

/**
 * Despliega el menú de opciones
 * */
fun showMenu() {
    println("Selecciona la opción deseada:")
    println("1. Hacer una receta")
    println("2. Ver mis recetas")
    println("3. Salir")
    println("Tu opción es:")
    println()
}

// Lista de ingredientes seleccionados por el usuario
val listaIngredientesSeleccionados : MutableList<String> = mutableListOf()

// Cuenta la cantidad de ingredientes que ya fueron ingresados por el usuario
var contadorLista : Int = 0


/**
 * Despliega los ingredientes del menú de listaIngredientes y permite al usuario elegir uno. Posteriormente lo añade a otra lista.
 *
 * */
fun hacerReceta() {
    val listaIngredientes : List<String> =
        listOf("Agua", "Leche", "Carne", "Zanahoria", "Tomate", "Cebolla", "Manzana", "Naranja", "Platano", "Cereal", "Huevo", "Aceite")

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

        listaIngredientesSeleccionados?.add(contadorLista, listaIngredientes[ingredienteSeleccionado-1])


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
    println()
}


/**
 * Despliega los ingredientes seleccionados por el usuario
 * */
fun mostrarReceta(){
    println("Los ingredientes que selecciono hasta el momento son: ")
    var contador = 1
    if (listaIngredientesSeleccionados != null) {
        for (ingredientes in listaIngredientesSeleccionados) {
            println("$contador: $ingredientes")
            contador++
        }
    }
    else {
        println("Aun no selecciono ningun ingrediente")
    }
    println()
}