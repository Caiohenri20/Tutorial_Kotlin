//1) Escreva uma função em Kotlin para somar os elementos de uma lista enviada como parâmetro

fun <T> toList(vararg args: T): List<T>{
    val list = ArrayList<T>()
    for (s in args){
    list.add(s)
    }
    return list
}

fun main(args: Array<String>) {
    val ints = toList<Int>(1,2,3,4,5)
    println(ints.sum())
}



/*2) Escreva um programa em Kotlin com uma função que recebe por parâmetro uma lista de
números inteiros e um número inteiro qualquer X e retorna a quantidade de vezes que X
encontra-se na lista.*/

fun conta (lista: List<Int>,  numero: Int): Int{
    var  cont:Int = 0    
    for (i in lista){
        if (i == numero){
            cont = cont +1
        }
    }
    return cont
}
fun main(args: Array<String>) {
    val ints = listOf<Int>(1,2,3,4,5,3,3,4,2)
    println (conta(ints,3))
}

