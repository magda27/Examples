public class CreateObject2 implements Cloneable {


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    String str = "New Object Created";


    public static void main(String[] args) {
        CreateObject2 obj2 = new CreateObject2();

        try{
            CreateObject2 obj3 = (CreateObject2) obj2.clone();
            System.out.println(obj3.str);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
