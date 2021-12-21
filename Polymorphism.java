class Solution1 {
    int ans;

    public void sum() {
        int var1 = 23;
        int var2 = 62;
        ans = var1 + var2;
        System.out.println(var1 + " + " + var2 + " = " + ans);
    }

    public void sum(int a, int b) {
        ans = a + b;
        System.out.println(a + " + " + b + " = " + ans);
    }

    public void sum(int x, int y, int z) {
        ans = x + y + z;
        System.out.println(x + " + " + y + " + " + z + " = " + ans);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Solution1 object = new Solution1();
        object.sum();
        object.sum(56, 89);
        object.sum(23, 84, 61);
    }
}
