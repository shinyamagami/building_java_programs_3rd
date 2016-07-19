public boolean negativeSum(Scanner input){
	int num = input.nextInt();
    int sum = num;
    int count = 1;
    boolean result = true;
	while(sum >= 0 && input.hasNextInt() == true){
        count++;
        num = input.nextInt();
        sum += num;
    }
    if(sum >= 0){
        result = false;
        System.out.println("no negative sum");
    } else {
        System.out.println(sum + " after " + count + " steps");
    }
    return result;
}
