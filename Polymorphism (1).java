class Solution{
    public void sum(int a, int b) {
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }
    public void sum(int a, int b, int c){
        int x = a  + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + x);
    }
}

class Polymorphism{
    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.sum(23, 34);
        obj.sum(43, 75, 12);
    }
}