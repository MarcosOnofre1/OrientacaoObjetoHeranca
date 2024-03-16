/*
    *LEMBRETE: Um dos pilares (que sao 4, Encapsulamento, Abstração, Herança e Polimorfismo), Abstrair: Ele acontece, porem ninguem precisa saber de como esta sendo ex: Assitir o video, porem
    nao precisa saber de como esta acontecendo, ah nao ser o dev, entao abstraia isso.

    *LEMBRETE: Uma classe que esta "private", ela nao pode ser herdada. Ela tem que estar "Open" para assim ser herdada.  

    - PUBLIC: O public por padrao ja é utilizado, caso voce nao adicione nenhum modificador de visibilidade, por padrao, ele ja é public.

    - PRIVATE: Podemos utilizar nos constructor, variaveis dentro/fora da classe e tambem podemos usar na classe. Lembrando que, usando o private na classe
    ele limita somente a o acesso no arquivo, ou seja, podemos usar normalmente a classe, porem, so no arquivo que esta sendo utilizado.

    - PROTECTED: Ele é um pouco menos restritivo que o private, ele da acesso a classe e as classes que herdam.
*/

private class X
open class Eletronicos(var marcas: String) {

    private fun ativarCorrente() {}

    fun ligar() {
        ativarCorrente()
    }

    fun desligar() {}
}

class Computadores(marcas: String) : Eletronico(marcas) {
    fun instalarSoftware() {}
    fun processar() {
    }
}

fun main() {
    var c: Computadores = Computadores("Asus")

    c.ligar()
    c.desligar()
    c.marca

    X()

}