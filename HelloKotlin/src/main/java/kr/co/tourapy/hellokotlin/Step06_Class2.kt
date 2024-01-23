package kr.co.tourapy.hellokotlin

class Person constructor(name:String){
	// 필드 선언
	// var name:String // null 이 들어올 수 있어서 오류남
	// var name:String? // java 에선 타입만 지정하면 가능했으나 kotlin 문법으론 불가하다.
	// var name2:String?=null // 이렇게 직접 넣어야 가능하긴 하다.

	// 생성자 객체를 통해 매개변수를 받고 필드에 넣는 방식으로 코드를 작성해야한다.
	var name:String  // 필드 선언
	init {
		this.name=name
	}
}

// 위의 코드를 줄이면 아래와 같다.
class Person2(var name: String) // () 안에는 매개변수이자 필드이다.
// 생성자에 정의한 매개변수의 모양 그대로 필드가 만들어지고 생성자에 전달한 값이 자동 저장된다.
class Person3(val name: String) // 수정 불가능한 필드를 선언(java : final)

fun main(){
	val p1=Person("김구라")
	val p2=Person2("해골")
	val p3=Person3("원숭이")
}