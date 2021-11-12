import java.util.ArrayList;

public class Test {
    private static int a =1;
    public static void main(String[]args){
        System.out.println("sdsdsdsd");
        //new SimableThread("A").start();
       // new SimableThread("B").start();
        //new SimableThread("C").start();
        System.out.println("----------------------------------------------------");

        Solution_Nc19 nc19 = new Solution_Nc19();
        System.out.println( nc19.FindGreatestSumOfSubArray(new int[]{1,-2,3,4,5,6,7}));

        ListNode listNode = new ListNode(0);
        listNode.addNode(new ListNode(1));


        Solution_NC78 solution_nc140 = new Solution_NC78();
        ListNode newNode = solution_nc140.ReverseList(listNode);

        while (newNode!=null){
            System.out.print("result： " + newNode.val+"  ");
            newNode = newNode.next;
        }

        Solution_NC121 solution_nc121 = new Solution_NC121();
        ArrayList<String> list = solution_nc121.Permutation("ABC");
        System.out.println("==========================================");
        for (String s : list){
            System.out.print(s+"   ");
        }


        try {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run(){
                    int a = 1/0;
                }
            });

            thread.setUncaughtExceptionHandler(exceptionHandler);
            thread.start();
        }catch (Exception e){
            System.out.print("error: " + e.getMessage());
        }

    }
    private static ChildThreadExceptionHandler exceptionHandler= new ChildThreadExceptionHandler();
    public static class ChildThreadExceptionHandler implements Thread.UncaughtExceptionHandler {
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(String.format("handle exception in child thread. %s", e));
        }
    }


}
