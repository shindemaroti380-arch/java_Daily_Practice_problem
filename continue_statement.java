public class continue_statement {
    public static void main(String[] args){
        for(int i = 0;i<50;i++){
            System.out.println(i);
            System.out.println("java is great");

            if(i==5){
                System.out.println(i);
                System.out.println("ending the loop");
                continue;
            }
        }
    }
    
}
