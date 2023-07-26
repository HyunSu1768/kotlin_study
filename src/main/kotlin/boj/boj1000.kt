package boj

fun main(){
    val (A, B) = readLine().orEmpty().split(" ").map { it -> it.toInt() }
    print(A+B)
}