public void transfer(BankAccount id, double amount){
    int fee = 5;
    if (this.balance > fee){
        if (amount > 0){
            if ( this.balance - fee >= amount){
                this.balance -= (amount + fee);
                id.balance += amount;
                this.transactions += 1;
                id.transactions += 1;
            } else {
                id.balance += (this.balance - fee);
                this.balance = 0;

                this.transactions += 1;
                id.transactions += 1;
            }
        }
    }
}
