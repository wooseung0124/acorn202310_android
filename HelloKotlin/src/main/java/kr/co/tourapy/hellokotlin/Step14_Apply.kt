package kr.co.tourapy.hellokotlin

fun main(){
	// 테스트 코드
	class Member{
		var num:Int?=null
		var name:String?=null
		var isMan:Boolean?=null

		fun showInfo():Unit{
			println("${this.num}, ${this.name}, ${this.isMan}")
		}
	}

	val m1 = Member().apply {
		num=1
		name="김구라"
		isMan=true
		showInfo()
		// apply 는 코드 실행 이후로 this 를 리턴해준다. m1은 Member type 인 셈이다.
	}

	// with 를 apply 처럼 사용해보기(실제로는 이렇게 사용하지 않는다)
	val m2 = with(Member()){
		num=1
		name="김구라"
		isMan=true
		showInfo()
		this// with 는 가장 마지막 라인에 있는 값이 리턴된다. 이 경우도 Member type 이다.
	}
}