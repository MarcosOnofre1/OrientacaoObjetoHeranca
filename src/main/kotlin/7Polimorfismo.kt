import java.lang.ArithmeticException

interface Funcionario {
    var salario: Float
    fun bonus(): Float
}

class Gerente(override var salario: Float): Funcionario {
    override fun bonus(): Float {
        return salario * 0.5f
    }
}
class Analista(override var salario: Float): Funcionario {
    override fun bonus(): Float {
        return salario * 0.3f
    }
}
/*
    - Polimorfismo, como o funcionario pode ser usado aqui pois o classe Gerente é um funcionario e o Analista tbm, ao inves de fazer duas fun, fazemos uma que
    atende as duas, pois o funcionario é herdeiro das 2 classes.
 */
fun salarioBonus(func: Funcionario){
    println(func.bonus())
}

fun main() {
    salarioBonus(Gerente(5000f))
    salarioBonus(Analista(4000f))

    try {
        // Exemplo do polimorfismo: Exception é polimorfismo, pois null e Ari sao Exception, entao serão anulados no try catch, pois ao ser realizado o Exception ja acaba o codigo.
    }catch (e: Exception){
    }catch (e: NullPointerException){
    }catch (e: ArithmeticException){

    }
}