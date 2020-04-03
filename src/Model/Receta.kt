package Model

class Receta {

    val listaIngredientes : MutableList<String> = mutableListOf()

    /**
     * Permite agregar un ingrediente a la lista de la clase Receta
     * */
    fun agregarIngrediente(ingredienteSeleccionado: String){
        listaIngredientes.add(ingredienteSeleccionado)
    }

    /**
     * Devuelve la receta seleccionada hasta el momento por el usuario mediante terminal
     * */
    fun getReceta(){
        println("Los ingredientes que selecciono hasta el momento son: ")
        var contador = 1
        if (listaIngredientes != null) {
            for (ingredientes in listaIngredientes) {
                println("$contador: $ingredientes")
                contador++
            }
        }
        else {
            println("Aun no selecciono ningun ingrediente")
        }
        println()
    }
}