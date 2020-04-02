package Model

interface IIngredientsActions {

    fun mostrarLista()
    fun agregarIngredienteDeseado(valor: Int)
    fun mostrarListaDeseados(ingrediente: Int)
}