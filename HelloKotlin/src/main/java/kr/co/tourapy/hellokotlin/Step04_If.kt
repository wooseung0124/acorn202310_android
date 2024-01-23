package kr.co.tourapy.hellokotlin

fun main(){
	val num=10

	val result:String
	// 조건부로 다른 값을 대입
	if (num%2 == 1){
		result="$num 은 홀수입니다."
	}else{
		result="$num 은 짝수입니다."
	}
	// 3항 연산자? ( 변수 = 조건문 ? 참 : 거짓 )
	// val result2:String = num%2 == 1? "$num 은 홀수입니다." : "$num 은 짝수입니다."

	// java 에서는 변수 선언시 대입 연산자 우측에 if문을 넣는 행위는 불가했다.
	// java 에서 if 문은 스스로 데이터를 리턴해주지 못하기 때문이다.

	// kotlin 은 대입연산자의 우측에 if문을 넣는 것이 가능하다
	// if 문이 남긴 데이터(리턴해준 데이터)가 대입 연산자를 통해서 변수에 대입한다.
	val result3:String = if (num%2 == 1){"$num 은 홀수입니다."} else {"$num 은 짝수입니다."}
	// 실행할 code 블럭이 없다면 중괄호 생략 가능
	val result4:String = if (num%2 == 1)"$num 은 홀수입니다." else "$num 은 짝수입니다."

	val result5:String? = if (num%2 == 1) {"$num 은 홀수입니다."} else null
}