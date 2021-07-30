fun main(){
    print("Input your one word: ")

    val inputWord = readLine()
    var outputWord = reverse(inputWord.toString())

    println(outputWord)
}

fun reverse(str: String): String{
    var reverse = ""

    for (i in str.length - 1 downTo 0){
        reverse += str[i]
    }

    return reverse
}