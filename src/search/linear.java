package search;

public class linear {
    public static void main(String[] args) {
        //список id тех кто не опалитл подписку

        int [] array = {3,6,8,4,1,61,82,3,23,234,2344,234,2453,45,645,567,567,568,3452,421};
        int index = search(array,2);

        if (index == -1){
            System.out.println("нет в списке");
        }else {
            System.out.println("в спике "+ index );
        }

    }
    public static int search(int [] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n){
                return i;
            }
        }
        return -1;
    }
}
