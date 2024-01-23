package kr.co.tourapy.hellokotlin

/*
	in java
	Map<String,Object> map = new HashMap<String, Object>();
	map.put("num", 1)
	map.put("name", "kimgura")
	map.put("isMan",true)

	int num = (int)map.get("num") // type casting 이 필요하다.
	String name = (String)map.get("name")
	boolean isMan = (boolean)map.get("isMan")
 */
fun main(){
	// ReadOnly Map type
	val mem:Map<String, Any> = mapOf<String, Any>("num" to 1, "name" to "김구라", "isMan" to true)

	val num:Any? = mem.get("num")
	val name:Any? = mem.get("name")
	val isMan:Any? = mem.get("isMan")
	// 혹은
	val num2 = mem["num"]
	val name2 = mem["name"]
	val isMan2 = mem["isMan"]

	// casting 동시에 진행
	val num3 = mem.get("num") as Int
	val name3 = mem.get("name") as String
	val isMan3 = mem.get("isMan") as Boolean
}