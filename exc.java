//made by Dallin Lyman
//catches errors
public class exc {
    public static void main(String[] args) {
        int i = 10;//variables used
        int s = 0;
        try{
            int [] n = {1,2,3,4};//makes an error; tries to get a value that doesn't exist
            System.out.println(n[i]);
        } catch(Exception e){
            System.out.println("Array does not have a value for " + i);
        }
        try{
            s=i/0;//tries to divide by zero
            System.out.println(s);
        } catch(Exception e){
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Program finished without crashing");//prints that the code succeeded
        }
    }
}
