import java.util.Arrays;
class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }
    public static int[] removeLocalMaxima(int[] array){
        //put your code here
        int x[]=new int[array.length];
        int j=0;
        int i=0;
        if(array[0]<=array[1])
            x[j++]=array[0];
        for(i=1;i<array.length-1;i++)
        {
            if(array[i]>array[i+1] && array[i]>array[i-1])
                ;
            else
                x[j++]=array[i];
        }
        if(array[i]<=array[i-1])
            x[j++]=array[i];
        int y[]=new int[j];
        System.arraycopy(x,0,y,0,y.length);
        return y;
    }
}
