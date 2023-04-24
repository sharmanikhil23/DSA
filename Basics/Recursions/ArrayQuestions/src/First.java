public class First {
    public static void main(String[] args) {
        int[] data={1,2,3,4,5,1};
        System.out.println("Checking if the Array is sorted or not ");
        System.out.println(check(data,1));
    }

    public static boolean check(int [] data, int index){
        if(index==data.length){
            return true;
        }
        return (data[index-1]<data[index]?true:false)&&check(data,index+1);

    }
}
