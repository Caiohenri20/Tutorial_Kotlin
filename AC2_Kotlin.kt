//1) Escreva uma função em Kotlin para somar os elementos de uma lista enviada como parâmetro

fun somaList(lista: List<Int>): Int{
    return lista.sum()
}

fun main(args: Array<String>) {
    var ints = listOf(1,2,3,4,5)
    println(somaList(ints))
}



/*2) Escreva um programa em Kotlin com uma função que recebe por parâmetro uma lista de
números inteiros e um número inteiro qualquer X e retorna a quantidade de vezes que X
encontra-se na lista.*/

fun contaElement(lista: List<Int>,  numX: Int): Int{
    return lista.count { it == numX }
}

fun main(args: Array<String>) {
    var ints = listOf(1,2,3,4,5,5,5)
    println(contaElement(ints,5))
}

/*3) Generalize a função do exercício anterior para funcionar para qualquer tipo de dados,
não só inteiros*/

fun contaElement(lista: List<Any>,  numX: Any): Int{
    return lista.count { it == numX }
}

fun main(args: Array<String>) {
    var ints = listOf('a','b','a')
    println(contaElement(ints,'a'))
}


/*4) Escreva um programa em Kotlin com uma função que recebe por parâmetro uma lista de
números inteiros e retorna o índice em que se encontra o maior elemento do vetor.*/


