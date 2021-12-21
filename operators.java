class operators {
    public static void main(String[] args) {
        int m1 , m2 ,m3 ,m4, avg;
        m1 = Integer.parseInt(args [0]);
        m2 = Integer.parseInt(args [1]);
        m3 = Integer.parseInt(args [2]);
        m4 = Integer.parseInt(args [3]); ;
        avg = ((m1+m2+m3+m4)/4);
        System.out.println("the average is "+avg);    
        
        if(avg < 75)
        {
            System.out.println("Good");
        }
        else
        {
            System.out.println("EXCELLENT");
        }
    }
}   

