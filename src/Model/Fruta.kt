package Model

class Fruta: Ingredients(), IIngredientsActions {

    override val cantidad: Int = 6
    var contadorListaFruta: Int = -1
    override fun mostrarLista(){
        println("Elegiste fruta")
        var contador = 1
        for (ingredientes in listaIngredientesFruta)
        {
            println("$contador: $ingredientes")
            contador++
        }
        println("Escoge el tipo de fruta:")
        println()
    }

    override fun mostrarListaDeseados(ingrediente: Int){
        agregarIngredienteDeseado(ingrediente)
        println("Eligió: ${listaFrutaDeseada[contadorListaFruta]} ")
    }

    override fun agregarIngredienteDeseado(ingrediente: Int) {
        listaFrutaDeseada?.add(listaIngredientesFruta[ingrediente-1])
        contadorListaFruta++
    }

    val listaIngredientesFruta : List<String> =
        listOf("Manzana", "Uva", "Lima", "Limón", "Plátano", "Naranja", "Mandarina", "Cereza", "Arándano", "Sandía", "Melón")

    val listaFrutaDeseada: MutableList <String> = mutableListOf()
}