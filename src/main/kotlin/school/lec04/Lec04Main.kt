package school.lec04

//fun main(){
//    val money1 = JavaMoney(2000L)
//    val money2 = JavaMoney(1000L)
//
//    if(money1>money2){
//        print("money1 이 더 큽니다.")
//    }
//    else if(money1!=money2){
//        print("money2가 더 큽니다.")
//    }
//    else{
//        print("같습니다")
//    }
//
//}

//fun main(){
//
//    val money1 = JavaMoney(1000L)
//    val money2 = money1
//    val money3 = JavaMoney(1000L)
//
//    println(money1 === money2)
//    println(money1 === money3)
//    println(money1 == money3)
//
//}

//fun main(){
//    if(fun1() || fun2()){
//        println("본문")
//    }
//}
//
//fun fun1(): Boolean{
//    println("fun1")
//    return true
//}
//
//fun fun2(): Boolean{
//    println("fun2")
//    return false
//}

fun main(){
    val money = Money(1000L)
    val money2 = Money(1000L)

    println(money+money2)
    println(money.plus(money2))
}