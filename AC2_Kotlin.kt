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

fun indiceElement(lista: List<Int>): Int{
    return lista.indices.maxBy { lista[it] } ?:0
}

fun main(args: Array<String>) {
    var ints = listOf(1,2,3,4,5,6,8)
    println(indiceElement(ints))
}


/*5) Utilizando Higher-Order Functions e Lambda, reescreva o programa anterior com uma
função retornaIndice para retorna o índice do maior ou menor elemento, de acordo com
uma função enviada como parâmetro. Esta função também deve ter um parâmetro opci-
onal que informa o maior ou menor valor possível.*/

fun maiorElemento(lista: List<Int>): Int{
    return lista.indices.maxBy { lista[it] } ?:0
}

fun menorElemento(lista: List<Int>): Int{
    return lista.indices.minBy { lista[it] } ?:0
}

fun filtroNumero(arg: List<Int>, filtro: (menorNumero: Int?=null, maiorNumero: Int?=null) -> (Int)): Int{    
	return filtro(arg, menorNumero, maiorNumero)
}

fun main(args: Array<String>) {
    var ints = listOf(1,2,3,4,5,6,8,0)
    println(filtroNumero(maiorElemento))
}




/*6) Utilizando lambda e funções anônimas, escreva um programa em Kotlin com uma função
encontraPesoIdeal, a partir da altura de uma pessoa. A função deve ter apenas uma li-
nha. Utilize as seguintes expressões (h == altura):
 Para homens: 72 . 7 * h  58 ;
 Para mulheres: 62 . 1 * h  44 . 7*/





