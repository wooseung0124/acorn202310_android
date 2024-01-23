package kr.co.tourapy.hellokotlin

import java.util.Scanner

fun main(){
	val scan=Scanner(System.`in`)
	println("점수 입력: ")
	val jumsu=scan.nextInt()
	when(jumsu){ // 90..100 이라고 입력하면 밑에 처럼 된다.
		in 90..100 -> println("90에서 100 사이 입니다.")
		in 80..90 -> println("80에서 90 사이 입니다.")
		else -> println("80아래 입니다.")
	}
	println("--------")
	when{
		jumsu >= 90 -> println("점수는 90이상 입니다.")
		jumsu >= 80 -> println("점수는 80이상 입니다.")
		else -> println("점수는 80아래 입니다.")
	}
	println("--------")
	when(jumsu){ // until : 큰값은 포함하지 않는다.
		in 90..100 -> println("A 학점")
		in 80 until 90 -> println("B 학점")
		else -> println("ABC 이외의 학점")
	}
}