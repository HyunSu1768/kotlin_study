package school.lec04;

import org.jetbrains.annotations.NotNull;

public class JavaMoney implements Comparable<JavaMoney>{

    private final long amount;

    public JavaMoney(long amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(@NotNull JavaMoney o) {
        return Long.compare(this.amount, o.amount);
    }

    public JavaMoney plus(JavaMoney javaMoney){
        return new JavaMoney(this.amount+javaMoney.amount);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JavaMoney javaMoney)) return false;

        return amount == javaMoney.amount;
    }

    @Override
    public int hashCode() {
        return (int) (amount ^ (amount >>> 32));
    }

    @Override
    public String toString() {
        return "JavaMoney{" +
                "amount=" + amount +
                '}';
    }
}
