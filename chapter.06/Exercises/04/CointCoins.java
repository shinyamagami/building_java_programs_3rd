public void countCoins(Scanner input){
	double pennies  = 0.01;
    double nickels  = 0.05;
    double dimes	= 0.10;
    double quarters = 0.25;
    double sum = 0.00;
    while(input.hasNext() == true){
        int num = input.nextInt();
        String currency = input.next();
        currency = currency.toLowerCase();
        if(currency.equals("pennies")){
            sum += (num * pennies);
        } else if(currency.equals("nickels")){
            sum += (num * nickels);
        } else if(currency.equals("dimes")){
            sum += (num * dimes);
        } else {
            sum += (num * quarters);
        }
    }
    System.out.printf("Total money: $%.2f", sum);
}
