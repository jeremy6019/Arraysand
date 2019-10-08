package java0905;

public class Iterator {

	public static void main(String[] args) {
	/*	2. 배열의 데이터 전체접근 
		   - 배열의 데이터는 일반반복문을 이용해서 순서대로 전체에 접근하는 것이 가능 
		   - 데이터의 모임들은 빠른 열거(Fast Enumeration)를 이용해서 데이터를 순서대로 접근하는 것이 가능 
		     배열,List,Set이 가능 
		     이러한 데이터들 Iterable이라고도 합니다. 
		     
		     for((임시변수 )String temp: names(데이터의 모임)) {
		     }		     
		     빠른 열의 사용법 
		     for(데이터1개를 저장할 임시변수:데이터모임이름){
		        데이터를 순회하면서 수행할 내용 
		     } 
*/    
		// 배열 만들기 
		String[] men = { "김어준", "주진우", "정봉주", "김용민", "정청래 ", "안민석" }; 
		
		// 배열 데이터 전체 접근 - 데이터 개수룰 리럴로 작성 
		for(int i = 0; i < 4 ; i++ ) {
			System.out.printf("%s\n",men[i]);
		}
		System.out.printf("=====================\n");
		
		// 데이터 개수를 속성을 이용해서 설정 
		// 데이터의 변화가 생겨도 출력부분을 수정할 필요가 없습니다.
		for(int i = 0; i < men.length ; i++ ) {
			System.out.printf("%s\n",men[i]);
		}
		System.out.printf("=====================\n");
		// 자주 사용하는 데이터가 속성의 형태로 있다면 매번 이름을 찾아서 접근하는 것은 
		// 시간 낭비가 될 수 있습니다.
		// 이런 경우에는 속성을 임시 변수에 대입해서 사용하면 접근 속도가 행상 될 수 있습니다. 
		int len = men.length;
		for(int i = 0; i < len ; i++ ) {
			System.out.printf("%s\n",men[i]);
		}
		System.out.printf("=====================\n");
		
		// 빠른 열거 사용 
		for(String name : men) {
			System.out.printf("%s\n",name);
		}
		
		/*
		 3. MVC패턴
		   - 데이터에 변경이 발생하더라도 출력하는 부분을 변경하지 않도록 프로그램을 만드는 방식 
		   - 데이터를 Model이라고 하고 출력하는 부분을 View이를 연결하는 부분을 Controller라고 해서 MVC라고합니다 .
		   - 데이터를 활용하는 프로그램에거 가장 중요하고 자주 언급되는 패턴입니다. 
		 */
		
	}

}
