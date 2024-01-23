package kr.co.tourapy.hellokotlin

// kotlin 에서 인터페이스 만들기

interface Remocon{
	fun up()
	fun down()
}

// 인터페이스를 구현한 클래스 만들기
class MyRemocon : Remocon{ // 인터페이스의 경우 객체를 뜻하는 ()를 붙이지 않는다.

	override fun up() {
		println("무언가를 올려요")
	}

	override fun down() {
		println("무언가를 내려요")
	}

	fun move(){
		println("움직여요")
	}
}

fun main(){
	val r1:MyRemocon = MyRemocon()
	val r2:Remocon = MyRemocon()

	// r1 은 MyRemocon type 이기 때문에 move() 메소드 포함하여 모든 메서드 사용가능
	r1.up()
	r1.down()
	r1.move()

	r2.up()
	r2.down()
	// r2.move() // 존재하지 않아 오류남

	// 각 언어별 형변환(casting)
	// in java (MyRemocon)r2
	// in kotlin r2 as MyRemocon

	val r3:MyRemocon = r2 as MyRemocon // kotlin 의 type casting
	r3.move() // r2.move() 에선 사용불가했지만 여기선 가능

	// in java : r2 instanseof MyRemocon
	// in kotlin : r2 is MyRemocon => smart casting
	if (r2 is MyRemocon){
		// smart casting 형변환 없이 바로 MyRemocon 의 기능을 사용할 수 있다.
		r2.move()
	}
}