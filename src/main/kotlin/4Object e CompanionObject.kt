class Matematica {
    /*
    - companion object = similar o "static" do java.

    - nao aceita 2 companion object na mesma classe. Pode ou nao ser nomeado tbm

    - dentro do companion object e do proprio object, eles podem ter a função "init".
     */
    companion object NOME {
        var x: String = "oi"
        fun teste() {}

        init {
            println("fui inicializado.")
        }
    }
    /*
     - o object é similar do companion, porem, podemos ter qnts nos quiser dentro da classe.

     - object é obrigatorio ter um nome.g
     */
    object Objt1 {

    }
    object Objt2 {

    }

}

fun main() {
    Matematica.x
    Matematica.x
    Matematica.x

    Matematica.x
    Matematica.teste()

    Matematica.Objt1
    Matematica.Objt2
    val m = Matematica()

}
