package kr.co.tourapy.hellokotlin

/*
 	[kotlin 기본 data type]
 	- import 없이 바로 사용 가능한 data type
 	Byte, Short, Int, Long
 	Float, Double
 	Boolean, Char
 	String

 	각 언어별 변수 선언법
 	자바스크립트 : let num1=10;
 	자바 : int num1=10;
 	코틀린 : var num1:int = 10
 	ㄴ> 코틀린은 타입을 변수명 뒤에 콜론을 붙이고 선언한다. 하지만 생략도 가능하다. 그리고 세미콜론 생략 가능하다.
 */
fun main(){
	println("Hello, World!")
	/*
		var 이라는 예약어는 변수를 만들 때 사용한다.
		val 이라는 예약어는 상수를 만들 때 사용한다.
	 */
	// 정수를 담을 수 있는 num1 이라는 변수를 만들어서 10 대입하기
	var num:Int = 10
	// 실수를 담을 수 있는 num2 라는 변수를 만들어서 10.1 대입하기
	var num2:Double = 10.1
	// 문자열을 담을 수 있는 myName 변수를 만들어서 "김구라" 대입하기
	var myName:String = "김구라"
	// num 은 변수(var)라서 값이 변경 가능함
	num = 11

	// val 은 값을 한번 결정하면 변경 불가하다.
	val num3:Int = 20
	// num3 = 21 이러면 오류남

	// type 추론이 가능한 경우 type은 생략 가능!
	var num4=10
	var num5=10.1
	var yourName="해골"
}
