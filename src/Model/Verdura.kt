package Model

import Model.IIngredientsActions
import Model.Ingredients

class Verdura: Ingredients(), IIngredientsActions {

    override val cantidad: Int = 6
    var contadorListaVerdura: Int = -1
    override fun mostrarLista(){
        println("Elegiste verdura")
        var contador = 1
        for (ingredientes in listaIngredientesVerdura)
        {
            println("$contador: $ingredientes")
            contador++
        }
        println("Escoge el tipo de verdura:")
        println()
    }

    override fun mostrarListaDeseados(ingrediente: Int){
        agregarIngredienteDeseado(ingrediente)
        println("Eligió: ${listaVerduraDeseada[contadorListaVerdura]} ")
    }

    override fun agregarIngredienteDeseado(ingrediente: Int) {
        listaVerduraDeseada?.add(listaIngredientesVerdura[ingrediente-1])
        contadorListaVerdura++
    }

    val listaIngredientesVerdura : List<String> =
        listOf("Tomate", "Cebolla", "Pimentón", "Lechuga", "Brócoli", "Zanahoria", "Rábano", "Ajo", "Espinaca", "Coliflor", "Apio")

    val listaVerduraDeseada: MutableList <String> = mutableListOf()
}