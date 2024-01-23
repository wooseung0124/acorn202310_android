package kr.co.tourapy.hellokotlin

// 익명 클래스 : 한번 호출시 객체를 생성하고 사라짐
// 익명 클래스를 정의함과 동시에 객체를 생성하는 것이 object 키워드다.

fun main(){
	// Remocon type 의 참조값을 간단히 얻어내기
	val r1:Remocon = object : Remocon{  // object : Remocon{} = new Remocon(){} 을 통해 생성된 객체를 object 에 담는다. <= class 익명(없음) implemented Remocon
		override fun up() {
			println("채널을 올려요")
		}

		override fun down() {
			println("채널을 내려요")
		}
	}

	r1.up()
	r1.down()
}