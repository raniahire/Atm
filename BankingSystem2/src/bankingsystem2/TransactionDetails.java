package bankingsystem2;

public class TransactionDetails {
    private int transactionId;
    private String transactionType;
    private double transactionAmount;

    public TransactionDetails(int transactionId, String transactionType, double transactionAmount) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
    }
    
    public void printTransactionDetails(){
        System.out.println("\nId : "+ transactionId);
        System.out.println("Type : "+ transactionType);
        System.out.println("Amount : "+ transactionAmount);   
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }
    
}

