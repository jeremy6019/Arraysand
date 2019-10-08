package java0905;

public class Array1 {

	public static void main(String[] args) {
		/*
		 ** 데이터의 모임 
		    - 배열(Array - List):비교 가능한(동일한 형태의 자료형)데이터를 모아놓은 자료구조
		      테이블의 열의 개념입니다.
		    - Class 또는 Map(Dictionary):테이블의 행의 개념입니다.
		      모여서 하나를 나타내기 위한 목적으로 사용
		    - 테이블 구조를 만들때는 Class의 List또는 Map의 List를 만듭니다. 
		      
		    ** Array
		    - 크기 변경이 안되는 비교 가능한 데이터를 모아 놓은 자료구조 
		    - 크기 변경이 안된다는 것이 다른 List와 다른 점입니다. 
		    
		    1차원 배열
		    - 차원이 1개인 배열  
		    1)생성 
		    데이터를 처음부터 가지고 있는 경우 
		    데이터의 자료형[]배열이름 = { 데이터의나열 };
		    int[] ar = { 100, 300,200 };
		    처음에 데이터를 가지고 있지 않은 경우데이터의 자료형[] 배열이름 = new 데이터의 자료형[데이터의 개수];
		    이렇게 만들면 숫자 자룟형은 0 , boolean은 false, 나머지는 null(아직 데이터가 없음)로 초기화 됩니다.
		    int[] xr = new int[5];//정수 5개를 저장할 수 있는 배열을 생성 
		    
		    2) 배열의 속성(객체의 성질을 나타내는 변수)
		    length: 배열의 데이터 개수를 리턴 
		    ar.length: 3
		    xr.length:5
		    
		     3) 배열에서 각 데이터의 접근 
		     배열이름[인덱스]: 인덱스는 0에서부터 length-1까지 
		     이 범위 이외의 인덱스를 사용하면 ArrayIndexOutOfBoundsException이 발생 
		     배열이름만 만들고 데이터를 대입하거나 크기를 만들지 않은 상태에서 
		     .length를 호출하면 NullPointException이 발생 
		     
		     4) 배열은 참조형입니다. 
		      # 기본형: 값을 저장하는 자료형 
		      1개의 데이터를 저장하기 위한 자료향변수가 데이터 자체를 의미 
		      boolean,byte,short,char,int,float,double
		      ---------------------------
		      # 참조형: 데이터의 참조를 저장하는 자료형 
		      0개 이상의 데이터를 저장  배열,클래스의 객체만 참조형 
		      배열은 인덱스를 이용, 클래스의 객체는 속성을 이용
		      참조형은 힙영역 사용(사용하지 못하게, 메모리를 재할당할 수  있게 만듬)
		      데이터를 가리키는 것이 아니라 시작 위치만 가리킨다.
		        
		 */
		
		 // 데이터를 처음부터 가지고 배열을 생성 
		// 데이터 1개의 자료형 [] 이름 = { 데이터 나열 } ; 
		int[] scores = {30,20,40,50};
		// 배열의 데이터 개수를 확인 
		// 배열의 데이터 개수는 length 속성을 이용 
		System.out.printf("scores의 데이터 개수:%d\n", scores.length);
		
		// 배열의 두번째 요소를 출력 
		// 배열을 가지고 요소를 찾을떄는 [인덱스]
		// 인덱스는 0~length-1
		System.out.printf("scores의 두번째 데이터:%d\n",scores[1]);
	  	  
		// br이라는 배열이름을 생성한 것입니다.
		// =을 한적이 없기 때문에 실제 데이터는 소유하고 있지 않습니다.
		//이런 경우에 .을 속성을호출하면 에러(실행안됨)는 아니고
		// 예외(실행은 되는데 문제 발생)가 발생
		// 단언(강제로 예외를 발생시키는 것)
		//NullPointException:참조형이 가리키는 데이터가 없어서 발생 
		int[] br = new int[4]; //4개를 저장할 수 있는 배열을 생성 
		System.out.printf("br의 데이터 개수:%d\n", br.length);
		
		//데이터가 4개인데 4번에 접근하면 잘못된 인덱스 
		//ArrayIndexOutOfBoundsException 발생 
		System.out.printf("br[4]:%d\n",br[4]);
		
		/*
		  2. 배열의 데이터 전체접근 
		   - 배열의 데이터는 일반반복문을 이용해서 순서대로 전체에 접근하는 것이 가능 
		   - 데이터의 모임들은 빠른 열거(Fast Enumeration)를 이용해서 데이처를 순서대로 접근하는 것이 가능 
		     배열,List,Set이 가능 
		     이러한 데이터들 Iterable이라고도 합니다. 
		     
		     for((임시변수 )String temp: names(데이터의 모임)) {
		     }		     
		     빠른 열겨의 사용법 
		     for(데이터1개를 저장할 임시변수:데이터모임이름){
		        데이터를 순회하면서 수행할 내용 
		     } 
		      
		 */
		
		
		 
		
		
		

	}

}
