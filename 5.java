//Create a class named Bank and other classes such as ICICI and HDFC. The Bank class should have default transaction charges, 
//which will serve as the base. Based on these default charges, the ICICI and HDFC classes will calculate their specific transaction charges.
//Ensure that proper access specifiers are used throughout the code.

class Bank {
  protected double transactionCharges=2.5;

  public double getTransactionCharge(){
    return transactionCharges;

  }
}
class ICICI extends Bank{
  private double additionalCharges=0.02; // let say 2% more charges

  @Override
  public double getTransactionCharge(){

    additionalCharges=transactionCharges+(additionalCharges*transactionCharges);
    return additionalCharges;

  }

}
class HDFC extends Bank{
  private double additionalCharges=0.03; // let say 3% more charges

  @Override
  public double getTransactionCharge(){

    additionalCharges=transactionCharges+(additionalCharges*transactionCharges);
    return additionalCharges;

  }

}
class  Banks {
  public static void main(String args[]){
    Bank b=new Bank();
    System.out.println("Bank transaction charge is "+b.getTransactionCharge());

    ICICI i=new ICICI();
    System.out.println("ICICI Bank transaction charge is "+i.getTransactionCharge());

    HDFC h=new HDFC();
    System.out.println("HDFC Bank transaction charge is "+h.getTransactionCharge());
  }

  
}
