package kr.co.tourapy.hellokotlin

fun main(){
	var str:String = "abcde12345"
	var str2:String? = "abcde12345"

	// 문자열의 길이를 참조해서 변수에 담기
	var length:Int = str.length // Int type
	var length2:Int? = str2?.length // Int? type

	var length3:Int = str2?.length ?:0
	// ㄴ> str2?.length 값이 null 이라면 기본값(디폴트)으로 0을 넣으라는 의미, 대입연산자의 우측이 null 일 가능성은 없다.
	// Elvis 연산자 ? : 는 null 인 경우에 기본값을 남기는 연산자
	// 따라서 length3 는 Int? 가 아닌 Int type 으로 선언할 수 있는 것이다.

}