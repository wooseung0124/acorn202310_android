package kr.co.tourapy.hellokotlin

fun main(){
	/*
		in java => public void a(){}
		in kotlin => fun a():Unit{} or fun a(){}
		코틀린에서 Unit 은 원시 type 이라고 지칭하고 java 의 void 와 비슷한 역할을 한다.
		반환값이 없다면 Unit 이라 생각하면 된다.

		[함수의 type 정의하는 방법]

		(매개변수의 모양) -> 리턴 type
	 */

	// 함수명(): 리턴 type{ 실행동작 }
	fun a():Unit{
		println("a 함수 호출됨")
	}
	// 이름이 없는 함수를 만들어서 그 참조값을 변수에 담기
	var b = fun(){}
	// java 처럼 변수명과 참조값에 각각 타입 정의 내리는 법
	var c:()->Unit = fun():Unit{}
	var d:()->Int = fun():Int{return 10}

	// String type 을 전달 받아서 해당 문자열의 길이를 리턴하는 함수를 변수에 담아보세요.
	fun(str:String):Int{
		return str.length
	}
	// 정답
	var e:(String)->Int = fun(str:String):Int{
		return str.length
	}
	// (String)->Int type 이기에 대입된다.
	e=fun(a:String):Int{return 999}

	// test 라는 변수에 값을 대입하라.
	var test:(Int, String)->Int
	test = fun(a:Int, b:String):Int{
		return 10
	}
}