/**
 * Auto Generated Java Class.
 */
public class SavingsAccount {
  static private double annualInterestRate;
  private double savingsBalance;
  // constructor method
  public SavingsAccount() {
    this.savingsBalance = 0;
  } 
  // contructor method
  public SavingsAccount(double savingsBalance) {
    this.savingsBalance = savingsBalance;
  } 
  //savings account balance getter 
  public double getSavingsBalance()
  { 
    return this.savingsBalance;
  }
  // set new interest rate
  public static void setInterestRate(double newInterestRate)
  {
    annualInterestRate = newInterestRate;
  }
  // calculate monthly interest
  public void calculateMonthlyInterest()
  { 
    double monthlyInterest;
    monthlyInterest = (double)(this.savingsBalance*annualInterestRate/12);
    this.savingsBalance += monthlyInterest;
  }
  public static void main(String[] args){
    //create objects saver1 and saver2 and instantiate
    SavingsAccount saver1 = new SavingsAccount(2000.0);
    SavingsAccount saver2 = new SavingsAccount(3000.0);
    

    //set interest rate to 4%
    SavingsAccount.setInterestRate(0.04);
    System.out.println("Savings Account Balances%n");
    System.out.println("Month           Saver1               Saver2");
    for (int i=0;1<12;i++) { 
       System.out.println(i+1 + "          "+ saver1.getSavingsBalance() + "        " + saver2.getSavingsBalance());
    }
    //change interest to 5%
    SavingsAccount.setInterestRate(0.05);
    System.out.println("13              " + saver1.getSavingsBalance() +"       " +saver2.getSavingsBalance());
    
    
  
  
} 
}

