

public class Fib {

  static int id = 1;

  static int[] calcs = null;

  public static void main(String[] args) {
     int num = Integer.valueOf(args[0]);
     calcs = new int[num];
     System.out.println("F(" + num + ")="); //+ fib(n)); 
     System.out.println("calculations...");
     System.out.println("\nfinal result:"+fib(num,num,id));
     for(int i=0;i<num;i++) 
      System.out.print("F[" + i + "]: " + calcs[i] + " ");
     System.out.println();
  }

  public static int fib(int n,int level,int id) {
     Fib.id = Fib.id + 1;
     int id2 = Fib.id - 1;
     //System.out.print( "id: " + Fib.id + " F(" + n + ") at level: " + level + " will have to calculate two ? ( ");
     if(n==0) { /*System.out.print(tabs(id-1));System.out.println(" no!! end value: " + n + " for level " + (level+1) + " with id:  " + id + " fib(0) is 0 ) "); */ return 0;}
     if(n==1) { /*System.out.print(tabs(id-1));System.out.println(" no!! end value: " + n + " for level " + (level+1) + " with id:  " + id + " fib(1) is 1 ) "); */ return 1;}

     if(n-1>1)calcs[n-1]++;if(n-1>1)calcs[n-2]++;
     //System.out.print(tabs(id-1));System.out.println("yes!! for: " + n + " id: " + id2 + " calculate: " + " F(" + (n-1) + ") + F(" + (n-2) + ") ) ");
     return(fib(n-1,level-1,id2)+fib(n-2,level-1,id));//id2));
  }

  public static String tabs(int level) {
     String tabs = "";
     for(int i=0;i<level;i++) {
         tabs += "  ";
     }
     return tabs;
  }

}
