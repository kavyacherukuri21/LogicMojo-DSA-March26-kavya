 public static int remove_dupli(List<Integer> arr) {
        for(int i=0;i<arr.size();i++) {
            int count = 0;
            for(int j=0;j<arr.size();j++) {
                if(arr.get(i).equals(arr.get(j))) {
                    count++;
                }
            }
                if (count > 1){
                    arr.remove(i);
                    i--;
                    
            }
}
        return arr.size();

    }

}
