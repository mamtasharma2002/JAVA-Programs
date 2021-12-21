class Sum{
    public int var1, var2, ans;
    public void Add_Val(int var1, int var2){
        this.var1 = var1;
        this.var2 = var2;
    }
    public void Cal_Val(){
        ans = this.var1 + this.var2;
    }
    public void Disp_Val(){
        System.out.println("Sum is: " + ans);
    }
}

public class ThisKey {
    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.Add_Val(45, 84);
        obj.Cal_Val();
        obj.Disp_Val();
    }
}
