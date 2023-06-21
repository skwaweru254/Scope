package ke.co.skwaweru254;

public class Main {
    public static void main(String[] args) {

        ClassLevel obj = new ClassLevel();

        //Static member 'ke.co.skwaweru254.ClassLevel.a' accessed via instance reference

        //int a = obj.a;
        int a = ClassLevel.a;

        String name = obj.name;

        System.out.println(a + "  " + name);

        //private cannot be accessed outside the class of definition

        /*float cost = obj.cost;*/

        BlockLevel bl = new BlockLevel();

        System.out.println(bl.greetings());

        //bl.a can only accessed within the block

        //System.out.println(bl.a);


    }
}