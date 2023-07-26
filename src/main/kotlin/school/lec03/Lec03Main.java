package school.lec03;


public class Lec03Main {
    public static void main(String[] args) {
        Person person = new Person("asdf",15);
        Child child = new Child("asdf",18);
        printAgeIfPerson(person);
        printAgeIfPerson(child);
    }

    public static void printAgeIfPerson(Object obj){
        if(obj instanceof Person){
            Person person = (Person) obj;
            System.out.println(person.getAge());
        }
    }
}
