package school.lec04;

public class Lec04Main {
    public static void main(String[] args) {

        JavaMoney money1 = new JavaMoney(30000L);
        JavaMoney money2 = new JavaMoney(20000L);

        if(money1.compareTo(money2)>0){
            System.out.println("크다");
        }

    }
}
