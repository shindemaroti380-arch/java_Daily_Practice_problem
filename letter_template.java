public class letter_template {
    public static void main(String[] args){
        String letter = "Dear <|name|>,thanks a lot";
        letter=letter.replace("<|name|>", "Harry");
        System.out.println(letter);


    }
    
}
