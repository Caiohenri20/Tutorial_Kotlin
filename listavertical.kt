fun main(args: Array<String>) {
    val ints = toList<Int>(1,2,3,4,5,3,3,4,2)
    var x = 1
    for (i in ints){
        if (i == x){
            ints.count()
        }
        println(i)
    }
}
