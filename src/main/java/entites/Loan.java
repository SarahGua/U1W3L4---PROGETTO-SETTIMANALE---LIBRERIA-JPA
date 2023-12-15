package entites;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Loan {
    @Id
    @GeneratedValue
    private UUID loanNumber;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String dateLoanBeginning;
    private String dateLoanExpected;
    private String dateLoanEffective;
    @Enumerated(EnumType.STRING)
    private LentElement lentElement;

    public Loan(User user, String dateLoanBeginning, String dateLoanExpected, String dateLoanEffective, LentElement lentElement) {
        this.user = user;
        this.dateLoanBeginning = dateLoanBeginning;
        this.dateLoanExpected = dateLoanExpected;
        this.dateLoanEffective = dateLoanEffective;
        this.lentElement = lentElement;
    }

    public Loan() {}

    public UUID getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(UUID loanNumber) {
        this.loanNumber = loanNumber;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDateLoanBeginning() {
        return dateLoanBeginning;
    }

    public void setDateLoanBeginning(String dateLoanBeginning) {
        this.dateLoanBeginning = dateLoanBeginning;
    }

    public String getDateLoanExpected() {
        return dateLoanExpected;
    }

    public void setDateLoanExpected(String dateLoanExpected) {
        this.dateLoanExpected = dateLoanExpected;
    }

    public String getDateLoanEffective() {
        return dateLoanEffective;
    }

    public void setDateLoanEffective(String dateLoanEffective) {
        this.dateLoanEffective = dateLoanEffective;
    }

    public LentElement getLentElement() {
        return lentElement;
    }

    public void setLentElement(LentElement lentElement) {
        this.lentElement = lentElement;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanNumber=" + loanNumber +
                ", user=" + user +
                ", dateLoanBeginning='" + dateLoanBeginning + '\'' +
                ", dateLoanExpected='" + dateLoanExpected + '\'' +
                ", dateLoanEffective='" + dateLoanEffective + '\'' +
                ", lentElement=" + lentElement +
                '}';
    }
}
