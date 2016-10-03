public void swapPairs(ArrayList<String> al){
    for(int i = 0; i + 1 < al.size(); i += 2){
        String f = al.get(i);
        String s = al.get(i+1);
        al.set(i, s);
        al.set(i+1, f);
    }
}
