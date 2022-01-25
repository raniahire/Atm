package bankingsystem2;

public class Transactions {
    private int counter=0;
    TransactionDetails[] transactionDetails=new TransactionDetails[100];
    
    public void updateTransaction(int transactionId,String transactiontype,double transactionAmount){
       TransactionDetails transaction=new TransactionDetails(transactionId,transactiontype,transactionAmount);
        transactionDetails[counter]= transaction;
        counter++;
    }
    public void transactionSearch(double amount){
        for (int i = counter-1; i >= 0; i--) {
            if (transactionDetails[i].getTransactionAmount()== amount) {
                transactionDetails[i].printTransactionDetails();
            }
        }
    }
    public void allTransactions(){
        for (int i = counter-1; i >= 0; i--) {
            transactionDetails[i].printTransactionDetails();
        }
    }
}
