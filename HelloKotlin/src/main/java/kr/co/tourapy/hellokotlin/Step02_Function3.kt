package kr.co.tourapy.hellokotlin

//sample data

// read only List<Int> : 정수형태 읽기전용 목록
val nums = listOf(1,2,3,4,5,6,7,8,9,10)

/*
	kotlin 에서 forEach 와 map 의 차이
		1. map() 은 메모리를 할당하고 반환 값을 저장한다. 즉, 기존 배열을 이용하여 새로운 배열을 반환한다.
		2. forEach() 는 반환값을 버리고 항상 정의되지 않은 값(undefined)을 반환한다. 콜백함수가 현재 배열을 변경하도록 한다.
 */

fun main(){
	// List 에 저장된 모든 아이템을 순서대로 참조해서
	nums.forEach(fun(item){
		// 원하는 작업 하기
		println(item)
	})
	println("=========")
	// 위의 code 를 좀 더 간략히 하면
	nums.forEach {
		println(it)

	}
	println("=========")
	// nums 배열을 이용해서 모든 item 에 2 를 곱한 새로운 배열 얻어내기
	var result= nums.map(fun(item):Int{
		return item*2
	})

	println(result)
	println("=========")

	// 위에 코드를 더 간략히
	var result2= nums.map {
		it*2
	}

	println(result2)
	println("=========")
}