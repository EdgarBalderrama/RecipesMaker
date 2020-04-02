package Model

class Leche: Ingredients(), IIngredientsActions {

    override val cantidad: Int = 6
    var contadorListaLeche: Int = -1
    override fun mostrarLista(){
        println("Elegiste leche")
        var contador = 1
        for (ingredientes in listaIngredientesLeche)
        {
            println("$contador: $ingredientes")
            contador++
        }
        println("Escoge el tipo de leche:")
        println()
    }

    override fun mostrarListaDeseados(ingrediente: Int){
        agregarIngredienteDeseado(ingrediente)
        println("Eligió: ${listaLecheDeseada[contadorListaLeche]} ")
    }

    override fun agregarIngredienteDeseado(ingrediente: Int) {
        listaLecheDeseada?.add(listaIngredientesLeche[ingrediente-1])
        contadorListaLeche++
    }

    val listaIngredientesLeche : List<String> =
        listOf("Leche de vaca", "Leche light", "Leche de soya", "Leche sabor chocolate", "Leche sabor vainilla", "Leche de almendra")

    val listaLecheDeseada: MutableList <String> = mutableListOf()
}