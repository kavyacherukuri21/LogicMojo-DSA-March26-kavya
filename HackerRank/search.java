  public static int search_element(List<Integer> arr, int target) {
    // Write your code here
        int n = arr.size();
        for(int i=0;i<n;i++) {
            if(arr.get(i) == target) {
                return i;
            }
        }
        return -1;

    }

}
