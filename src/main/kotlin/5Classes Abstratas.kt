abstract class Mamifero(val nome: String) {
    fun Acordar() {}
    fun Dormir() {}

    /*
    - Uma classe abstract, ela precisa ser herdada.
    - uma classe que tem uma função abstract, ela se torna abstract tbm. Ou seja, o "open" precisa ser substituido pelo abstract
    - uma classe abstract, ela nunca pode ser instaciada. A intenção dela é como se fosse um molde pra outras classes que herdam.
    - abstract agr vira um comportamento, nao tem mais a implementação "{}"
    - podemos ter inumeras funcoes abstract, porem, ela precisa ser implementada na classe herdada (ex: Cachorro do "falar")
    - uma função abstract, ela vai ter um comportamento, porem, quem vai decidir esse comportamento é a classe que esta herdando. (Ex: Cachorro)
     */
    abstract fun falar()

}

class Cachorro(nome: String) : Mamifero(nome){
    override fun falar() {

    }

}

fun main() {

}