class ProductOfNumbers {
    ArrayList<Integer> arr;
    public ProductOfNumbers() {
        arr = new ArrayList<>();
    }
    
    public void add(int num) {
        arr.add(num);
    }
    
    public int getProduct(int k) {
        int res = 1;
        int n = arr.size();
        while(k>0){
            res *= arr.get(n-1);
            n--; k--;
        }
        return res;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */