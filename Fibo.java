public class Fibo{
	public int fibonacci(int a){
		if(a >= 1)
			return a+a;
			if(a > 100)
				return a*a;
			return fibonacci(a-2)*fibonacci(a+2);
	}
}