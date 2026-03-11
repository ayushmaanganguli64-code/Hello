public class HelloUC2{
    public static void main (String[] args){
        if (args.length>0){
            System.out.print("Hello "+args[0]);
        }
        else{
            System.out.print("Hello World");
        }
    }
}