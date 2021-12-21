class ConditionalStatement{
    public static void main(String[] args) {
        int mark1, mark2, mark3;
        int average;
        mark1 = Integer.parseInt(args[0]);
        mark2 = Integer.parseInt(args[1]);
        mark3 = Integer.parseInt(args[2]);
        average = (mark1 + mark2 + mark3)/3;

        System.out.println(average);
        if(average >= 75){
            System.out.println("Excellent");
        }else if(average >= 70 && average < 75){
            System.out.println("Very Good");
        }else if(average >= 60 && average < 70){
            System.out.println("Good");
        }
    }
}