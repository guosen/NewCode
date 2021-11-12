public class SimableThread extends Thread{

    public static int currentCount = 0 ;
    public SimableThread(String name){
        setName(name);
    }

    @Override
    public void run() {
       while (currentCount < 30){
           switch (currentCount % 3){
               case 0:
                  if ("A".equals(getName())){
                      print();
                  }
                  break;
               case 1:
                   if ("B".equals(getName())){
                       print();
                   }
                   break;
               case 2:
                   if ("C".equals(getName())){
                       print();
                   }
                   break;
           }
       }

    }

    private void print(){
        System.out.print(getName());
        if("C".equals(getName())){
           System.out.println();
        }
        currentCount++;
    }
}
