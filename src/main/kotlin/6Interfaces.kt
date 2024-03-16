
/*
 - A interface tem uma diferença da classe "abstract", a "interface" voce implementa, ja a abstract voce herda.
 - a diferença entre "interface" e "abstract" tambem sao as variaveis dentro dela. A interface nao tem capacidade de manter estados.
 ou seja, uma variavel nao pode ter valor, voce pode definir uma variavel (String, Float, Int e etc.) no entanto voce nao pode atribuir valores
 a eles. Ja em "abstract" voce consegue! Entao a principal diferença é essa.
 - Vale lembrar tbm que uma "interface" ela nao pode ser instaciada, assim como a classe abstract.

 */
interface Selvagem{
    fun morder()
}

abstract class Ovipero (val nome: String){

    fun acordar(){
        println("Acordei")
    }
    fun dormir(){
        println("Dormi")
    }

    abstract fun falar()

}

class Cobra (nome: String) : Ovipero(nome), Selvagem{
    override fun falar() {

    }

    override fun morder() {

    }

}

fun main() {

}