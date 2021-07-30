fun main (){
    print("Input your word to check: ")

    val inputWord = readLine()

    println("The $inputWord is " + isPalindrome(inputWord.toString()))
}
fun isPalindrome(str: String): String{
    val reversed = str.reversed()
    return if(str.equals(reversed, ignoreCase = true)){
        "Palindrom"
    }else{
        "not Plaindrom"
    }
}