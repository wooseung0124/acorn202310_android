package kr.co.tourapy.hellokotlin

fun main(){
	// 1~10 까지 출력
	for (num in 1..10){
		println(num)
	}
	println("----------")
	/*
		in java
		for(int i=0; i<11; i++){
			println(num);
		};
	 */
	for (num in 10 downTo 1){
		println(num)
	}
	println("----------")
	// 1,3,5,7,9...2씩 증가시키면서 출력
	for (num in 1..10 step 2){
		println(num)
	}
	println("----------")
	// 1,3,5,7,9...2씩 감소시키면서 출력
	for(num in 10 downTo 1 step 2){
		println(num)
	}
	println("----------")
	val names=listOf("김구라", "해골", "원숭이", "주뎅이", "덩어리")
	// 반목문으로 역순 출력하기
	for (i in names.size-1 downTo 0){
		println(names[i])
	}


}