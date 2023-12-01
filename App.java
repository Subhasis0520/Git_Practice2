public class App
{
    public static void main(String[] args) {
        int i =10;
        if(i%2 ==0)
          System.out.println("even");
          else
          System.out.println("odd");
    }
	
	// bug - 124
	public boolean isPrime(int n){
		boolean flag = true;
		if(n < 2)
			flag = true;
		
		
		for(int i=2; i*i <= n;i++){
			if(n % i==0){
				flag = false;
				break;
			}	
		}
		return flag;
}
