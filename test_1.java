interface circle{
    public void draw();
    public void erase();
}
interface triangle{
    public void draw();
    public void erase();
}
interface square{
    public void draw();
    public void erase();
}
class Shape_1 implements circle,triangle,square{
    public void draw(){
        System.out.println("I am in the Draw method");
    }
    public void erase(){
        System.out.println("I am in the erase method");
    }
}
class test_1{
    public static void main(String[] args) {
        Shape_1 sp_1 = new Shape_1();
        sp_1.draw();
        sp_1.erase();
    }
}
