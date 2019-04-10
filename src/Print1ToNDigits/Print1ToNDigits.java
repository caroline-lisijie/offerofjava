package Print1ToNDigits;

public class Print1ToNDigits {
    public static void Print1ToMaxofNDigits(int n){
        int [] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=0;
        }
        while(Increment(a)){
            PrintNum(a);
        }
    }
    public static boolean Increment(int [] a){
        for(int i=a.length-1;i>=0;i--){
            if(a[i]!=9){
                a[i]+=1;
                break;
            }
            else if(a[i]==9 && i!=0){
                a[i]=0;
                continue;
            }
            else if (a[i]==9 && i==0)
                return false;

        }
        return true;

    }
    public static void PrintNum(int [] a){
        int temp=0;
        while(temp<a.length&&a[temp]==0)
            temp++;
        for(int i=temp;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        Print1ToMaxofNDigits(2);
    }
}
