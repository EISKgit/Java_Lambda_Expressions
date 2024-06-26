public class LambdaExp{
    
   
    public static void main(String [] args){


       System.out.println("Hello!,World.test 4"); 

       //case1
       TataMotors t1= new TataMotors(); //class-instance based execution
       t1.drive(22);

        //case2
        vehical v1= new vehical()
       {
        @Override
        public int drive(int s){
            System.out.println("@FunctionalInterface of vehical - output.");
            return 00;
        }
       };//semicolon is must at the end of anonymus interface execution.
       v1.drive(2);


       System.out.println("Testing Lambda Expresssions .....");
       //case3 --Lambda Expressions in anonymus function of @FunctionalInterface.@interface
       bike b1= (int k) ->{
            int r=0;
            System.out.println("bike speed "+k+"km/hr");

            if(k>65)System.out.println("Bike Riding is on ['Not-safe mode'].");
            else if(k<=65)System.out.println("Bike Riding is on ['Safe mode'].");
            else System.out.println("Drive safe");
            
            return r;
            //if there was only "return value" in output of method - 
            //bike b1 = k -> r; works perfectly. 
        };
        b1.Speed(57);
       };

       

    }


@FunctionalInterface
interface vehical {
    public int drive(int s);
}

@FunctionalInterface
interface bike {
    public int Speed(int k);
}

class TataMotors implements vehical{
    //@Override
    @Override
    public int drive(int s){
        System.out.println("class TataMotors impliments vehical (@FunctionalInterface)-output");
        return 01;
    }
}
