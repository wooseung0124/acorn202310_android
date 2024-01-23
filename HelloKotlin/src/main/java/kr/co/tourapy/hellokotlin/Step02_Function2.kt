package kr.co.tourapy.hellokotlin

// 함수 type을 전달받는 함수를 정의해보자.

fun userFun(a:()->Unit) {
	a() // 매개변수 a에 전달된 함수 호출
}

// 메인 메서드
fun main(){
	// userFun() 함수를 호출해보세요.
	userFun (fun(){ println("오잉?") })
	// fun() 생략 가능
	userFun ({ println("오오잉?") })
	// 함수를 호출하는 표현식() 생략가능
	userFun { println("오오오잉?") }

	println("======================")

	// userFun2() 함수를 호출해보세요.
	userFun2(fun(){ println("오홍")}, 3)
	// fun() 생략 가능
	userFun2({ println("오홍홍")}, 3)
	// 함수를 호출하는 표현식() 생략가능???? => 불가함
	// userFun2{ println("오홍홍") }(3)

	println("======================")

	// userFun3() 함수를 호출해보세요.
	userFun3(1, fun(){ println("오호라")})
	// fun() 생략 가능
	userFun3(1, { println("오호호라")})
	// 함수를 호출하는 표현식() 생략가능
	userFun3(1){ println("오호호호라")}
}

fun userFun2(a:()->Unit, b:Int):Int{
	a() // 매개변수 a에 전달된 함수 호출
	return b
}

fun userFun3(a:Int, b:()->Unit):Int{
	b() // 매개변수 a에 전달된 함수 호출
	return a
}