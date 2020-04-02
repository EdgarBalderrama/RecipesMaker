package Model

class Cereal: Ingredients(), IIngredientsActions {

    override val cantidad: Int = 6
    var contadorListaCereal: Int = -1
    override fun mostrarLista(){
        println("Elegiste cereal")
        var contador = 1
        for (ingredientes in listaIngredientesCereal)
        {
            println("$contador: $ingredientes")
            contador++
        }
        println("Escoge el tipo de cereal:")
        println()
    }

    override fun mostrarListaDeseados(ingrediente: Int){
        agregarIngredienteDeseado(ingrediente)
        println("Eligió: ${listaCerealDeseada[contadorListaCereal]} ")
    }

    override fun agregarIngredienteDeseado(ingrediente: Int) {
        listaCerealDeseada?.add(listaIngredientesCereal[ingrediente-1])
        contadorListaCereal++
    }

    val listaIngredientesCereal: List<String> =
        listOf("Avena", "Trigo", "Arroz", "Maíz")

    val listaCerealDeseada: MutableList <String> = mutableListOf()
}