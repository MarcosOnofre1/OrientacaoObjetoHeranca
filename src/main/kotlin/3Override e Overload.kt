open class Eletronic(var marca: String) {
    private fun corrente(ativo: Boolean) {}
    fun ligar() {
        corrente(true)
    }

    // a função tem que ser "open" para chamar o override.
    open fun desligar() {
        corrente(false)
    }
}

class PC(marca: String) : Eletronic(marca) {
    // overrride= sobrescreve uma função.
    override fun desligar() {
        save()
        // super = tem acesso a metodos e atributos.
        super.desligar()
    }

    // Exemplo Overload = quando tem o mesmo nome de função, mas oque as diferem(diferença) sao os numeros e tipos de parametros.
    fun save() {}
    fun save(a: Int) {}
    fun save(a: Double) {}
    fun save(a: Float) {}
}
fun main() {
    val c: PC = PC("DELL")
    c.ligar()
    c.desligar()
}