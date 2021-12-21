 /*class constructor {
     String name;
     int id;

     constructor(){
         System.out.println("the values are");

        name = "mamta";
        id = 4;
     }
     public static void main(String[] args) {
         constructor c1 = new constructor();
         System.out.println("name " + c1.name);
         System.out.println("id " + c1.id);
     }
}*/
class constructor{
    String  name;
    int id;

    constructor(String student_name,int id){
    this.name = student_name;
    this.id = id;
    }
    public static void main(String[] args) {
        constructor c1 = new constructor("mamta", 34);
        constructor c2 = new constructor("riya", 24);

        System.out.println("student 1 name :" + c1.name);
        System.out.println("student 1 id :" + c1.id);

        System.out.println("student 2 name :" + c2.name);
        System.out.println("student 2 id :" + c2.id);
        
    }
}
