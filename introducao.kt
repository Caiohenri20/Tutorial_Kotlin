
fun main(args: Array<String>) {
    var nome = "Ana Paula"
    println("Olá $nome") //print pula linha
    var nomeCompleto = "$nome Lopes" //concatena variavel e novo valor
    print(nomeCompleto) //print sem pular linha
}


fun main(args: Array<String>) {
    var nome:String? = "Ana Paula" //possibilita trocar o valor para null
    println("Olá $nome")
    nome = null
    println("Olá $nome")
}


fun main(args: Array<String>) {
    var nome:String? = "Ana Paula"
    println("Olá $nome")
    if (nome != null){
        println("tamanho da string: ${nome?.length}") //faz a impressão de quantidade
    }
}


fun parOuImpar(n: Int) = if (n % 2 == 0) "par" else "impar"

fun enviarEmail(usuario:String, titulo:String? = null):String{
    val t = titulo?: "Bem vindo" //se o valor for null é enviado esse titulo padrão
    return "$usuario $t"
}

fun main(args: Array<String>) {
    println(enviarEmail("Fernando", "ola"))
    println(parOuImpar(2))
    println(parOuImpar(3))
}



fun enviarEmail(usuario:String, titulo:String? = null):String{ 
    val t = titulo?: "Bem vindo" //se o valor for null é enviado esse titulo padrão
    return "$usuario $t"
}

fun main(args: Array<String>) {
    println(enviarEmail(titulo = "Fernando", usuario = "ola")) //nomea o valor para cada parametro
    println(parOuImpar(2))
    println(parOuImpar(3))
}



fun toList(vararg arg: String): List<String>{ 
    var lista = ArrayList<String>()
    for (s in arg){
        lista.add(s)
    }
    return lista
}

fun main(args: Array<String>) {
    println(toList("a", "b", "c", "d", "e"))
}




fun <T> toList(vararg arg: T): List<T>{ //usar o T parametriza para receber qualquer tipo
    var lista = ArrayList<T>()
    for (s in arg){
        lista.add(s)
    }
    return lista
}

fun main(args: Array<String>) {
    println(toList<String>("a", "b", "c", "d", "e"))
    println(toList<Int>(1, 2, 3, 4, 5))
}



class Aluno(nome: String, idade: Int){
    val nome: String
    val idade: Int
    
    init{
        this.nome = nome
        this.idade = idade
    }
    override fun toString(): String{
        return "Aluno $nome, idade $idade anos"
    }
}

fun main(args: Array<String>) {
    val a1 = Aluno("Fernando", 18)
    println(a1)
}


fun toList(vararg arg: Int):Int{ 
    var soma = 0
    for (s in arg){
        soma = (soma + s)
    }
    return soma
}

fun main(args: Array<String>) {
    println(toList(1,3,5,4,6))
}


fun main(args: Array<String>) {
    var arrayListInt = ArrayList<Int>()
    
    arrayListInt.add(1)
    arrayListInt.add(2)
    arrayListInt.add(3)
    
    var listaMutavel = mutableListOf<Int>(1,2,3,4,5)
    println(listaMutavel)
    listaMutavel.add(10)
    println(listaMutavel)
    
    var listaImutavel = listOf<String>("a", "b", "c")
    println(listaImutavel)
    //listaImutavel.add("d") lista imutavel não pode ser modificada
    listaImutavel = listOf<String>("1","2","3")
    println(listaImutavel)
}



fun filtrar(list: List<Int>, filtro:(Int) -> (Boolean)):List<Int>{
    val newList = arrayListOf<Int>()
    for (item in list){
        if (filtro(item)){
            newList.add(item)
        }
    }
    return newList
}

fun numerosPares(numero: Int):Boolean{
    return numero % 2 == 0
}

fun numerosMaioresQue3(numero: Int): Boolean{
    return numero > 3
}

fun main(args: Array<String>) {
    var ints = listOf(1,2,3,4,5)
    println(ints)
    var novaLista = filtrar(ints, ::numerosPares)
    println(novaLista)
    novaLista = filtrar(ints, ::numerosMaioresQue3)
    println(novaLista)
}


fun main(args: Array<String>) {
    var lista = ArrayList<Int>()
    for (arg in args){
        lista.add(arg.toInt())
    }    
    println(lista.sum())
    println(args.map(String::toInt).sum())
    println(somaList(args.map(String::toInt)))
}


fun somaList(lista: List<Int>): Int{
    var somar: Int = 0    
    for (i in lista){
        somar = somar + i
    }
    return somar
}
