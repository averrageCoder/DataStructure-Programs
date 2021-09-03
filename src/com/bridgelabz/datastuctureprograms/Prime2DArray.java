package com.bridgelabz.datastuctureprograms;

public class Prime2DArray {

	public static void main(String[] args) {
		
		prime2DArr();
		
	}
	private static boolean checkingPrime(int num) {

		int count=0;
		for (int i = 2; i <=num/2; i++){
			if(num%i==0){
				count++;
				break;
			}
		}
		if(count==0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static void prime2DArr()
	{
		int array[][] = new int [10][100];
		int prime[][] = new int [10][100];
		int temp = 1;
		
		for(int i=0; i<10; i++){
			for(int j=0; j<100; j++){
				array [i][j] = temp;
				temp++;
			}
		}
		for(int i=0; i<10; i++){
			for(int j=0; j<100; j++){
				//System.out.print(array[i][j]+" ");
				if(checkingPrime(array[i][j])) {
					prime[i][j] = array[i][j];
				}
				else {
					prime[i][j]=1;
				}
			}
		}
		for(int i=0; i<10; i++){
			for(int j=0; j<100; j++){
				if(prime[i][j]!=1){
					System.out.print(prime [i][j]+"\t");
				}
			}
			System.out.println();
		}
		return ;
	}

}
