public String toString() {
    String result = "";
    if (balance > 0){
        result = this.name + ", $" + this.balance;
        return result;
    } else if (balance < 0){
        result = this.name + ", -$" + (-1) * this.balance;
        int l = result.length();
        char c = result.charAt(l - 2);
        if (c == '.'){
            result += "0";
        }
        return result;
    } else {
        result = this.name + ", $" + this.balance;
        int l = result.length();
        char c = result.charAt(l - 2);
        if (c == '.'){
            result += "0";
        }
        return result;
    }
}
