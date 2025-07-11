package com.classobj;

public class oddeven {
	
	public void odd() {
		
		int arr[]= new int[5] ;
		arr[0]=10;
		arr[1]=21;
		arr[2]=30;
		arr[3]=43;
		arr[4]=50;
		
		for(int i=0;i<5;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]+" even no");
			}else {
				System.out.println(arr[i]+ " odd no");
			}
		}
	}

}
