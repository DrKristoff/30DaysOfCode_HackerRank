//Write your code here
class Calculator implements AdvancedArithmetic{
    
    public Calculator(){
        
                       }
    
    public int divisorSum(int num){
        int sum = 1;  //everything is divisible by 1
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
            sum += i;
            }
        }
        return sum;
	}
        
 
}