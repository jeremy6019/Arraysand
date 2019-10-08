package java0905;

import java.util.Scanner;

public class search {

	public static void main(String[] args) {
/*
		 **검색(Search)
		 1.순차 검색 
		 - 데이터가 정렬되지 않은 경우에 데이터를 맨앞에서부터 순서대로 검색 
		 - 데이터가 없다는 사실을 알게되는데는 데이터 전체를 다 비교해봐야압니다.
		 
		 2. 제어 검색 
		 - 데이터가 정렬된 경우에 사용 
		   1) binary search(이분검색)
		    - 중앙값과 비교해서 작으면 왼쪽 크면 오른쪽에 다시 이분검색을 수행 
		     10 20 30 40 50 60 70
		     - 50을 검색 
		      7개의 데이터 중 가운데 값이 4번째  데이터와 비교 
		      50이 40보다 크므로 오른쪽 데이터들을 가지고 다시 비교 
		      오른쪽에 3개가 있으므로 가운데 값이 60과 비교
		      60보다는 작으니까 왼쪽에 50과 비교  
		 
		  2) ### 피보나치 검색 - 금융쪽  필수 (최근 거래내역 이것으로 뽑아냄) 
		   - 피보나치 수열을 이용 
		   - 모든 꽃잎의 수 
		     첫번째와 두번째  데이터는 1 
		     세번째 데이터 부터는 이전 데이터 2개의 합
		     1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89....  
		 
		   3) 보간 검색 
		     검색값-최소값 / 최대값 - 최소값 를 계산해서 데이터를 검색 
		     60을 검색 60-10 / 70-10 : 5/6 * 7 를 계산해서 그 데이터를 검색 
		     구간별 균등하다는 전제 필요 
		     A-Z 
		     B를 검색  
		     B-A /  Z-A * 26번째를 검색 
		  
		  4) binary tree search(이진 트리 검색) 
		    - 데이터를 tree구조로 정렬해서 검색 
		    - 파일 시스템에서 사용 
 */
         
		//입력받은 숫자 번째 파보나치 수열의 값 구하기 
	     Scanner sc = new Scanner(System.in); 
	     
	     System.out.printf("정수를 입력하세요:");
	     int num = sc.nextInt(); 
	     
	     //구할 수열의 2번째 이전 데이터를 저장할 변수 
	     int n1 = 1;
	     //구할 수열의 1번째 이전 데이터를 저장할 변수 
	     int n2 = 1;
	     //피보나치 수열의 값을 저장할 변수 
	     int fibo = 1;
	     for(int i=3; i <= num; i++) {
	    	 fibo = n1 + n2;
	    	 
	    	 n1 = n2; 
	    	 n2 = fibo;
	     }
	     
		System.out.printf("%d번째 피보나치 수열의 값:%d\n", num, fibo);
		
		sc.close();
		
		
		
		
	}

}
