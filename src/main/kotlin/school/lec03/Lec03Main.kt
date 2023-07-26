package school.lec03

fun main(){

}
fun printAgeIfPerson(obj: Any){
    if(obj is Person){
        val person = obj
        println(person.age)
    }
}

fun printAgeIfPersonNullable(obj: Any?){
    val person = obj as? Person
    print(person?.age)
}