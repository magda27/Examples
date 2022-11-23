public class CreateObject3 {
    void show(){
        System.out.println("A new object created");
    }

    public static void main(String[] args){
        try {
            Class cls = Class.forName("CreateObject3");
            CreateObject3 obj = (CreateObject3) cls.newInstance();
            obj.show();
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
        }catch(InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
