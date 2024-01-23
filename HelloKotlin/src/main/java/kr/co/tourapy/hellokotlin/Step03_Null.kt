package kr.co.tourapy.hellokotlin

/*
	String 과 String? 은 다른 type 으로 취급된다.
	즉 type 에 ?가 붙은 것과 안 붙은 것은 다른 type이다.
	? 가 없으면 null 이 불가능한 type
	? 가 있으면 null 이 가능한 type
 */
fun main() {
	var a: String
	var b: String = "kim"
	var c: String? = null

	// println(a.length) // 초기화 되지 않았기 때문에 a 는 사용불가
	println("문자열의 길이: " + b.length)
	println("문자열의 길이: " + c?.length) // c 가 null 이 아닌 경우에만 length 를 참조해라(null safe)

	println("main 함수가 종료됩니다.")
}