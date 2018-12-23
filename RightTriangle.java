public class RightTriangle{
    public static void main(String[] args){
        for(int i = 1; i<=6; i++){
            drawBar(i);
        }
    }
    public static void drawBar(int length){
        for(int i = 1; i<=length; i++){
        System.out.print("*");
        }
        System.out.println("");
    }
}