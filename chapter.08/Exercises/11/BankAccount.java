public boolean transactionFee(double fee){
    for (int i = 1; i <= this.getTransactionCount(); i++){
        balance -= fee * i;
    }
    if (balance > 0){
        return true;
    } else if (balance < 0){
        balance = 0.0;
        return false;
    } else {
        return false;
    }
}
