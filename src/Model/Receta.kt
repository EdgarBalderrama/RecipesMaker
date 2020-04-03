package Model

class Receta {

    val listaIngredientes : MutableList<String> = mutableListOf()

    fun agregarIngrediente(ingredienteSeleccionado: String){
        listaIngredientes.add(ingredienteSeleccionado)
    }

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