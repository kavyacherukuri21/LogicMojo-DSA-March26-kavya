public static int singlelement(int n, List<Integer> arr) {
    int m = arr.size();
        for(int i=0;i<m;i++) {
            int count = 0;
        for(int j=0;j<m;j++) {
            if((arr.get(i)).equals (arr.get(j))) {
                count++;
        }
        }
            if(count==1)
                return arr.get(i);
        }
        return -1;
           

    }

}
