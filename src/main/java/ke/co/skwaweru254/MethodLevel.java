package ke.co.skwaweru254;

public class MethodLevel {

    public String eating(){

        String food = "rice";

        //method scope: variable a cannot be accessed here on eating method

        //System.out.println(drinking(a));

        return "We are eating chicken " + food;

    }

    public String drinking(){

        int a = 89;

        System.out.println(a);
        return "We are drinking";
    }


}
