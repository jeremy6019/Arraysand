package java0905;

public class SortandEtc {

	public static void main(String[] args) {
		/*
		 정렬(Sort) 
		 - 데이터를 순서대로 나열 
		 - 오름차순(Ascending): 작은 것에서 큰 것 순으로 배치 (기본) 
		 - 내림차순  (descending): 큰 것에서 작은 것순으로 배치 
		 # 데이터를 빨리 찾기 위하여 정렬을 함 
		 
		 *  정렬 알고리즘 
		 1) Selection Sort(선택정렬) - 학습용 
		 2) Bubble Sort (인접정렬)
		 3) Insertion sort(삽입정렬)
		 4) **Quick Sort** (제일 중요) 
		 
		 * Selection Sort (선택정렬): 데이터 개수:n이라고 가정하고 시작한다.
		  - 첫번째  데이터부터 n-1번째 데이터까지 자신의 뒤에 있는 모든 데이터와 비교해서 정렬 
		   
		 */

	    int[] arr = { 88, 94, 30, 45, 75 }; 
	    //데이터의 개수 저장 
	    int len = arr.length;	    
	    
/*	 
	    //데이터의 개수가 n이라면 n-1번 수행 
	    for(int i=0; i < len-1; i++) {
	        // 회전수 + 1번째 부터 마지막까지 비교 	
	    	for(int j =i+1; j < len; j++) {
	       //앞의 데이터가 뒤의 데이터보다 크다면 swap 
	    		if(arr[i] > arr[j]) {
	    			int temp = arr[j];
	    			arr[j] = arr[i]; 
	    			arr[i] = temp; 	    			
	    		}
	    		
	    	}
	    	
	    }
		 // 데이터 출력 
	   for(int temp : arr) {
	        System.out.printf("%d\t", temp);
	   }
	*/   
	   /* 
	     ** Bubble Sort(버블정렬) 
	      - 최대 n-1 회전 동안 자신의 뒤에 있는 데이터와 비교해서 정렬하는 방식  
	      - 1회전동안 데이터의 교체가 없으면 정렬이 완료된 것이므로 비교 중지 가능 
	      - 가장  큰 것을 뒤로 보내는 방식(오름차순)
	      - 어느 정도 정렬이 되어 있으면 빠른 속도로 정렬함     
	      * 인접했다 -> 자신의 뒤에 있다. 
	      데이터가 n개일때 
	      n-1 회전동안 
	      0 - n-2번째까지 자신의 바로뒤에 있는 데이터와 비교 
	      0 - n-3번째까지 자신의 바로 뒤에 있는 데이터와 비교 
	      ...  
	      
	    */
	   //최대 n-1회전 
       for(int i=0; i < len-1; i++) {
    	  //데이터 교체가 있었는지 확인할 변수 
    	   boolean flag = true;
    	   // 첫번째부터 마지막 데이터 이전까지 
    	   for(int j=0; j< len - 1 - i; j++) {
    		   //자신의 뒤에 데이터와 비교해서 정렬 
    		   if(arr[j] > arr[j+1]) {
    			   int temp = arr[j];
    			   arr[j] = arr[j+1];
    			   arr[j+1] = temp;
    			   flag = false;
    		   }
    	   }
    	   //1회전 동안 데이터 교체가 없었으면 비교 종료 
    	   if(flag == true) {
    		   break; 
    	   }
    		   
       }
       
          for(int temp : arr ) {
    	       System.out.printf("%d\t", temp);
          }
 
          
          
	}

}
