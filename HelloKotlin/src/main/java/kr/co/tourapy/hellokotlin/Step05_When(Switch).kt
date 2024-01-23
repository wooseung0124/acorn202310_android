package kr.co.tourapy.hellokotlin

import java.util.Scanner

fun main(){
	/*
		java 패키지에 있는 클래스 import 가능
		in 은 예약어인데 예약어를 #escape 하는 방법은 backtick(``) 으로 감싸주면 된다.
		new 예약어 없이 클래스명() 형식으로 객체 생성한다.

		# 이스케이프 문자(Escape sequence)는 입출력 시 사용할 수 있는 커서 이동 및 출력 불가 문자
	 */
	val scan:Scanner= Scanner(System.`in`) // java 에서 사용했던 객체 생성 new를 사용하지 않아도 된다.
	println("Gun:1, Sword:2")
	print("무기를 선택하세요(1 or 2):")
	val weapon=scan.nextInt()
	// weapon 안에 들어 있는 숫자를 이용해서 분기하기
	when(weapon){ // kotlin 에는 switch 문이 없다.
		1->{
			println("총으로 공격해요")
		}
		2-> println("칼로 공격해요") // 실행할 code 가 한줄이면 중괄호 생략 가능

		else->{
			println("주먹으로 공격해요")
		}
	}
	// 대입연산자의 우측에 when() 문을 작성할 수도 있다. selectedWeapon 는 type 추론이 가능하기에 ':String' 이 생략되었다.
	val selectedWeapon=when(weapon){
		1-> "총"
		2-> "칼"
		else -> "주먹"
	}

	// java 에선 Object type 이 존재하지만 kotlin 에선 없다. 대신 Any type 이 존재한다. 참고로 kotlin 에서 object 는 예약어로 활용된다.
	val selectedWeapon2:Any=when(weapon){
		1-> "총"
		2-> "칼"
		else -> 0
	}
}