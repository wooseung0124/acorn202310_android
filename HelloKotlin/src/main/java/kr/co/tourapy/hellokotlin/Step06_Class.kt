package kr.co.tourapy.hellokotlin

// 클래스 정의하기
class MyCar

class YourCar{
	// 멤버 함수(메서드)
	fun drive(){
		println("달려요!")
	}
}

// 대표(primary) 생성자는 클래스명 우측에 constructor 을 선언한다.
class Ship constructor(){
	// init 블럭은 대표 생성자의 일부이다.
	init {
		// 객체를 생성하는 시점에 초기화 하고 싶은 작업이 있으면 여기서 한다.
		println("Ship() 생성자가 호출되었습니다.")
	}
}

// constructor 예약어 생략가능
class Ship2(){
	init {
		println("Ship2() 생성자가 호출되었습니다.")
	}
}

// 생성자의 인자로 전달 받을 게 없으면 () 도 생략가능
class Ship3{
	init {
		println("Ship3() 생성자가 호출되었습니다.")
	}
}

fun main(){
	// MyCar 클래스로 객체를 생성해서 참조값을 c1 에 담기
	val c1:MyCar = MyCar()
	val c2:YourCar = YourCar()
	c2.drive()

	val s1=Ship()
	val s2=Ship2()
	val s3=Ship3()
}