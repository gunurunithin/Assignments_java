
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String products[]={"Laptops","Mobiles","Speakers","Earphones"};
        int quantity[]={30,50,100,200};
        String specifications[]={"1tb & 256 gb, 4 & 6 gb ram internal memory","intel i5,i7","Mediatek Dimensity 1080","JBL speakers","realme earpods"};
        int costs[]={70000,15000,3000,2000};

        while(true){
            Allitems();
            int n= sc.nextInt();
            sc.nextLine();
            if(n==1){
                P1(products);
            }
            if(n==2){
                P2(products,quantity);
            }
            if(n==3){
                P3(products,specifications,quantity,costs);
            }
            if(n==4){
                int num=sc.nextInt();
                sc.nextLine();
                String edit=sc.nextLine();
                P4(products,specifications,num,edit);
            }
            if(n==5){
                P1(products);
                int num1= sc.nextInt();
                sc.nextLine();
                P2(products,quantity);

                int cnt=sc.nextInt();
                sc.nextLine();
                P5(products,quantity,num1,cnt);
            }
            System.out.println("Press 1 to continue - ");
            char ch=sc.nextLine().charAt(0);
            if(ch=='1'){
                continue;
            }
            else{
                System.exit(0);
            }
        }
    }

    private static void P5(String[] products, int[] quantity, int num1, int cnt) {
        quantity[num1-1]=quantity[num1-1]+cnt;
        System.out.println("After Updation - "+products[num1-1]+" New are - "+quantity[num1-1]);
    }


    private static void P4(String[] products, String[] specifications, int num, String edit) {
            specifications[num-1]=edit;
            System.out.println("Item - "+products[num-1]+" Specification edited as - "+specifications[num-1]);
    }

    private static void P3(String[] products, String[] specifications, int[] quantity, int[] costs) {
        for(int i=0;i<4;i++){
            System.out.println("item - "+products[i]+" Specifications - "+specifications[i]+"Quantity -"+quantity[i]+" Costs - "+costs[i]);
        }
    }


    private static void P2(String[] products, int[] quantity) {
        for(int i=0;i<4;i++){
            System.out.println("item - "+products[i]+" "+quantity[i]);
        }
    }

    private static void P1(String[] products) {
        for(int i=0;i<4;i++){
            System.out.println(products[i]);
        }
    }

    private static void Allitems() {
        System.out.println("1.List Of Products");
        System.out.println("2.Quantity of products");
        System.out.println("3.Specifications of Products");
        System.out.println("4.Edit a Product");
        System.out.println("5.Update Inventry");
    }

}
