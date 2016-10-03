public void removeEvenLength(ArrayList<String> als){
	for(int i = 0; i < als.size(); i++){
        if(als.get(i).length() % 2 == 0){
            als.remove(i);
            i -= 1;
        }
    }
}
