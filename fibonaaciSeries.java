public class fibonaaciSeries {
    int[] seriesWithoutRecursion( int n){
      int[] series = new int[n];
      series[0] =0;
      if(n>1){
          series[1] =1;
          for(int i=2;i<n;i++){
              series[i] = series[i-1]+ series[i-2];
          }
      }
      return series;
    }
    static int series(int n ){
        if(n==0)return 0;
        if(n==1)return 1;
        int a =0;
        int b = 1;
        int c = 0;
        for(int i =2;i<=n;i++){
            c = a+b;
            a = b;
            b =c;

        }
        return c;
    }
   static int seriesWithRecursion( int n){
        if(n==0)return 0;
        else if(n==1)return 1;
        else return seriesWithRecursion(n-1)+ seriesWithRecursion(n-2);
    }

    public static void main(String[] args) {
        System.out.println(seriesWithRecursion(6));
        System.out.println(series(6));
    }
}
