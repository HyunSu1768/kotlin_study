package boj

fun main(){
    val (A, B) = readLine().orEmpty().split(" ").map { it -> it.toDouble() }
    print(A/B)
}