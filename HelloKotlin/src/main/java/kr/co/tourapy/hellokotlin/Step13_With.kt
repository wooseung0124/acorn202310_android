package kr.co.tourapy.hellokotlin

fun main(){
	class Member{
		var num:Int?=null
		var name:String?=null
		var isMan:Boolean?=null

		fun showInfo():Unit{
			println("${this.num}, ${this.name}, ${this.isMan}")
		}
	}

	val m1=Member()
	m1.num=1
	m1.name="김구라"
	m1.isMan=true
	m1.showInfo()

	val m2=Member()
	with(m2){
		num=2
		name="해골"
		isMan=false
		showInfo() // 함수 호출 이후로 반환 값 type 이 없다. 때문에 변수에 담아봤자 아무것도 없을 것이다.
	}

	val m3 = Member()
	val result:String = with(m3){// with 가 반환한 data type 이 String 인 이유 : 마지막 요소가 String type 이라서
		num=3
		name="원숭이"
		isMan=true
		"${this.num}, ${this.name}, ${this.isMan} 입니다."// 마지막 line 이 리턴 값이다.
	}
}