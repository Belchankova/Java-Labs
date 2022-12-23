package paket;
public class Main {

public static void main(String[] args) throws Exception {

Food[] breakfast = new Food[20];

 for(int itemIndex=0; itemIndex <args.length; itemIndex++) {
 String[] parts = args[itemIndex].split("/");
 if (parts[0].equals("Cheese")) {

breakfast[itemIndex] = new Cheese();
 }  if (parts[0].equals("Apple")) {

breakfast[itemIndex] = new Apple(parts[1]);
 }

 else if (parts[0].equals("ChewingGum")) {

	 breakfast[itemIndex] = new ChewingGum(parts[1]);
	  }
 }
 
 for (Food item: breakfast) {
 
 if (item==null) break;

 item.consume();
 }


 int c = 0;
 int a = 0;
 int p = 0;
 ChewingGum gg=new ChewingGum (null);
 for(int i = 0; i < args.length; i++) {

     if(breakfast[i].equals( new Cheese( ))){
         c++;
     }
     else if (breakfast[i].equals( new Apple( null))){
         a++;
     }
     else if (breakfast[i] .equals(gg)){
         p++;
     }
     
    
    
 }


 
 
 for (Food item: breakfast) {

 if (item==null) break;

 item.consume();
 }
 System.out.println("Сыр - " + c);
 System.out.println("Яблоко - " + a);
 System.out.println("Жевачка - " + p);
System.out.println("Всего хорошего!");
}
}
