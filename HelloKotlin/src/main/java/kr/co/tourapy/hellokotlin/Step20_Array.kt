package kr.co.tourapy.hellokotlin

fun main(){
	/*
	 	array 와 list 는 고정배열이다. 때문에 추가하는 기능은 없다.

	 	차이점
	 	Array => 아이템 수정 가능
	 	List => 아이템 수정 불가

	 	mutableList => 아이템 수정 가능, 추가 가능
	 */

	// 정수 배열(array) 객체 생성하기
	val nums:Array<Int> = arrayOf<Int>(10,20,30)
	val nums2:List<Int> = listOf<Int>(10,20,30)
	// 문자 배열
	val names:Array<String> = arrayOf<String>("김구라", "해골", "원숭이")
	val names2:List<String> = listOf<String>("김구라", "해골", "원숭이")

	// 아이템 수정
	nums[0] = 100 // Array
	nums.set(1,100) // Array

	// array 도 map, filter 함수 사용 가능
	val result:List<Int> = nums.map{
		it*2
	}
	// forEach 사용 가능
	nums.forEach {
		println(it)
	}
}