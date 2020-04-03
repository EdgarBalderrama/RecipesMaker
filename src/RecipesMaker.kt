import Model.*
import java.lang.NumberFormatException

// Ejecución del programa mediante el menú principal

val receta = Receta()

fun main() {
    do {
        showMenu()

        val resultadoTeclado : Int?  = readLine()?.toInt()
            when(resultadoTeclado) {
                1 -> hacerReceta()
                2 -> receta.getReceta()//mostrarReceta()
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
var contadorLista: Int = 0


/**
 * Despliega los ingredientes del menú de listaIngredientes y permite al usuario elegir uno. Posteriormente lo añade a otra lista.
 *
 * */
fun hacerReceta() {
    val listaIngredientes : List<String> =
        listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")

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


    if (ingredienteSeleccionado != null) {
        elegirSubIngrediente(ingredienteSeleccionado)
        if (ingredienteSeleccionado == 1 || ingredienteSeleccionado == 7 || ingredienteSeleccionado == 8){
            try {
                println("Elegiste:" )
                println(listaIngredientes[ingredienteSeleccionado!!-1])

                receta.agregarIngrediente(listaIngredientes[ingredienteSeleccionado-1])
                //listaIngredientesSeleccionados?.add(contadorLista, listaIngredientes[ingredienteSeleccionado-1])


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
        }
    }


    println()
}


/**
 * Te muestra una lista de la variedad de productos que tiene el ingrediente que se selecciona previamente
 * */
fun elegirSubIngrediente(ingrediente: Int){
    when(ingrediente){
        2-> {
            val leche = Leche()
            println(leche.mostrarLista())
            val lecheSeleccionada = readLine()?.toInt()
            if (lecheSeleccionada != null) {
                leche.mostrarListaDeseados(lecheSeleccionada)
            }
            receta.agregarIngrediente(leche.listaLecheDeseada.last())
            //listaIngredientesSeleccionados?.add(leche.listaLecheDeseada.last())
        }
        3-> {
            val carne = Carne()
            println(carne.mostrarLista())
            val carneSeleccionada = readLine()?.toInt()
            if (carneSeleccionada != null) {
                carne.mostrarListaDeseados(carneSeleccionada)
            }
            receta.agregarIngrediente(carne.listaCarneDeseada.last())
            //listaIngredientesSeleccionados?.add(carne.listaCarneDeseada.last())
        }
        4-> {
            val verdura = Verdura()
            println(verdura.mostrarLista())
            val verduraSeleccionada = readLine()?.toInt()
            if (verduraSeleccionada != null) {
                verdura.mostrarListaDeseados(verduraSeleccionada)
            }
            receta.agregarIngrediente(verdura.listaVerduraDeseada.last())
            //listaIngredientesSeleccionados?.add(verdura.listaVerduraDeseada.last())
        }
        5-> {
            val fruta = Fruta()
            println(fruta.mostrarLista())
            val frutaSeleccionada = readLine()?.toInt()
            if (frutaSeleccionada != null) {
                fruta.mostrarListaDeseados(frutaSeleccionada)
            }
            receta.agregarIngrediente(fruta.listaFrutaDeseada.last())
            //listaIngredientesSeleccionados?.add(fruta.listaFrutaDeseada.last())
        }
        6-> {
            val cereal = Cereal()
            println(cereal.mostrarLista())
            val cerealSeleccionada = readLine()?.toInt()
            if (cerealSeleccionada != null) {
                cereal.mostrarListaDeseados(cerealSeleccionada)
            }
            receta.agregarIngrediente(cereal.listaCerealDeseada.last())
            //listaIngredientesSeleccionados?.add(cereal.listaCerealDeseada.last())
        }
    }
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

enum class Frutas
{
    Manzana, naranja
}
