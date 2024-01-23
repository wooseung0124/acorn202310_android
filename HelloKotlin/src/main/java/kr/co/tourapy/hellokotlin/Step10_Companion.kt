package kr.co.tourapy.hellokotlin

/*
	[ in java ]

	class Util{
		public static int number = 10;
		public static void get(){};
	}
	Util.get();
	Util.number;
 */

class Util{
	// Util 클래스와 함께하는 동반객체(companion object)
	// ㄴ> kotlin 에선 static 개념이 없지만 동반객체를 통해 구현해낼 수 있다.

	companion object{
		// 동반객체의 필드와 메서드(함수)를 정의하면 된다.
		val version:String="1.0"
		fun send(){
			println("전송합니다.")
		}
	}
}

fun main(){
	// 동반객체에 정의된 필드나 메서드를 클래스명에 .을 찍어서 바로 사용할 수 있다.
	Util.send()
	println(Util.version)
}