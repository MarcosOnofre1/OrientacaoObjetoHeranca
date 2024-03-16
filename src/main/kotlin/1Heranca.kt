/*
  - devemos evitar ao maximo codigos que executam a mesma coisa, alem de escrever mais, se tiver uma logica que precise mexer em um lugar
  voce consequentemente vai ter que mexer no outro tambem e vice versa. Entao nao é proveitoso que tenha codigos que executam a mesma coisa.

  - Para herdar uma classe, devemos deixar ela "open" como fizemos ali no "Eletronico", para assim ser usada, como no exemplo do "Computador"
 */

open class Eletronico(var marca: String) {
    fun ligar() {}
    fun desligar() {}
}

/* - na herança, quando a classe filha (computador) tem o mesmo atributo (marca), nos nao vamos definir o var, pois seria como a gente
  estivesse definindo 2x a variavel.

  - Podemos ter comportamentos a mais na filha que nao tenha no pai, nao é pq herdamos do pai a filha fica limitada somente com q o pai tem,
  podemos adicionar mais comportamentos na fiha.
 */
class Computador(marca: String) : Eletronico(marca) {
    fun instalarSoftware() {}
    fun processar() {}
}

fun main() {
    var c: Computador = Computador("dell")

    // tudo que o "Pai" tem, conseguimos herdar para o "filho", ou seja, comportamentos, atributos o acesso do pai temos no filho.
    c.ligar()
    c.desligar()
    c.marca
    
}