fun main(){
    print("Input your time to convert in 24 hours ex. 03:10:34 PM : ")

    val inputTime = readLine()
    println(convert24(inputTime.toString()))
}

fun convert24(str: String): String {
    val middleTime = str.substring(3,9)
    return if (str.takeLast(2) == "AM" && str.take(2) == "12") {
        "00:$middleTime"
    } else if (str.takeLast(2) == "AM"){
        str.take(8)
    } else if (str.takeLast(2) == "PM" && str.take(2) == "12"){
        str.take(8)
    } else{
        (str.take(2).toInt() + 12).toString() + ":" + middleTime
    }
}