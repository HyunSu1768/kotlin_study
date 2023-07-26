package school.lec02

import java.lang.RuntimeException

fun main(){

    val number1: Int? = null
    val number2: Long = number1?.toLong() ?: 0L

    print(number2)

}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw RuntimeException("NULL 입니다.")
}

fun startsWith2(str: String?): Boolean? {
    if(str==null){
        return null
    }
    return str.startsWith("A")
}

fun startsWith3(str: String?): Boolean {
    if(str==null){
        return false
    }
    return str.startsWith("A")
}

fun startsWithA5(str: String?): Boolean{
    return str?.startsWith("A")
        ?: throw RuntimeException("null 입니다.")
}

fun startsWithA6(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA7(str: String?): Boolean{
    return str?.startsWith("A") ?: false
}

fun startsWithA9(str: String?): Boolean{
    return str!!.startsWith("A")
}