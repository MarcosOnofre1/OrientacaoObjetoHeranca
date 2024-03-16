interface Event {
    fun onSucess()
}

class Programa {
    fun salvar (e: Event) {
        println("Abrindo conexoes.")
        println("Salvando cvalores.")
        println("Sucesso! Conexoes fechadas.")
        e.onSucess()
    }
}
fun main() {
    val p = Programa()
    // usando o object esta herdando ":" de Event, sendo assim uma classe anonima.
    p.salvar(object : Event {
        override fun onSucess() {
            println("onSucess!")
        }

    })


}