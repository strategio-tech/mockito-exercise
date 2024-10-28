package tech.strategio.student;

import java.math.BigDecimal;

public class Student {

    private String id;
    private String firstName;
    private String lastName;
    private BigDecimal balance;
    private BigDecimal monthlyAllowance;

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BigDecimal getBalance() {
        // DO NOT KNOW HOW IT IS CALCULATED
        return null;
    }

    public BigDecimal getMonthlyAllowance() {
        // DO NOT KNOW HOW IT IS CALCULATED
        return null;
    }

}
