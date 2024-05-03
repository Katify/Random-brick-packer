import java.util.Random;

public class primitive_data_types {
    public static void main(String[] args) {

        Random rand = new Random();
        int num = rand.nextInt(100)+1;

      int even = 2;

      if (num%even != 0 ){
          System.out.println(num+": is odd");
      }
      else{System.out.println(num+": is even");}

      System.out.println("");
      System.out.println("");


      int AmountofBricks = rand.nextInt(100-50+1)+50;
      int ComtainerCapacity = rand.nextInt(10-5+1)+5;
      int fullcont = AmountofBricks/ComtainerCapacity;
      int notfull = AmountofBricks%ComtainerCapacity;

        System.out.println(AmountofBricks+ " This is the random amout of bricks generated");System.out.println(ComtainerCapacity+ " This is the container capacity generated");System.out.println(fullcont + " This is the number of full containers");System.out.println(notfull + " This is the number of bricks in the not full container");

    }
}
