package Model

class Carne: Ingredients(), IIngredientsActions {

    override val cantidad: Int = 6
    var contadorListaCarne: Int = -1
    override fun mostrarLista(){
        println("Elegiste carne")
        var contador = 1
        for (ingredientes in listaIngredientesLeche)
        {
            println("$contador: $ingredientes")
            contador++
        }
        println("Escoge el tipo de carne:")
        println()
    }

    override fun mostrarListaDeseados(ingrediente: Int){
        agregarIngredienteDeseado(ingrediente)
        println("Eligió: ${listaCarneDeseada[contadorListaCarne]} ")
    }

    override fun agregarIngredienteDeseado(ingrediente: Int) {
        listaCarneDeseada?.add(listaIngredientesLeche[ingrediente-1])
        contadorListaCarne++
    }

    val listaIngredientesLeche : List<String> =
        listOf("Carne de res", "Carne de pollo", "Carne de pavo", "Carne de pescado")

    val listaCarneDeseada: MutableList <String> = mutableListOf()
}