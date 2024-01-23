package kr.co.tourapy.hellokotlin

import kr.co.tourapy.hellokotlin.java.MemberDto

fun main(){
	// java 클래스를 import 해서 객체 생성후 참조값을 변수에 담기
	val dto:MemberDto = MemberDto()
	// setter 메서드 사용시
	// dto.setNum(1)
	dto.num = 1

	// dto.setName("김구라")
	dto.name = "김구라"

	// dto.setAddr("노량진")
	dto.addr = "노량진"

	// getter 메서드 사용시
	// val a:Int = dto.getNum()
	val a = dto.num
	val b = dto.name
	val c = dto.addr
}