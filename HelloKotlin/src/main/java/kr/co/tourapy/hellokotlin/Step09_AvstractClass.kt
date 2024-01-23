package kr.co.tourapy.hellokotlin

// 추상 클래스 -> abstract 예약어를 이용해서 만든다.
abstract class Weapon{ // 추상 클래스는 애초에 상속을 위한 객체이므로 open 을 적을 필요가 없다.
	fun move(){
		println("이동합니다.")
	}
	// 추상 메소드 역시 abstract 예약어를 이용한다.
	abstract fun attack()
}

class MyWeapon : Weapon(){
	// 추상메서드 오버라이드가 강제된다.
	override fun attack() {
		println("무언가를 공격해요!")
	}
}

fun main(){
	val w1:Weapon = MyWeapon()
	w1.move()
	w1.attack()
	// 별도로 클래스를 정의하지 않더라도 object 키워드를 이용해서 Weapon type 의 참조값 얻어내기
	val w2:Weapon = object : Weapon(){
		override fun attack() {
			TODO("Not yet implemented")
		}
	}
	w2.move()
	w2.attack()

	// 다형성 확인
	val w3:MyWeapon=MyWeapon()
	val w4:Weapon = w3
	val w5:Any = w3 // Any type 은 java 에서 Object type 에 해당하는 type 이다.
}