package kr.co.tourapy.hellokotlin

fun main(){
	var str = "1000"
	var str2 = "천"

	// kotlin 은 try_catch 문을 담을 수 있다.
	var result = try {
		Integer.parseInt(str) // 예외가 발생되지 않을 때 대입될 값
	}catch (nfe: NumberFormatException){
		0 // 예외발생시 대입될 값
	}
	println("result: ${result}")
}