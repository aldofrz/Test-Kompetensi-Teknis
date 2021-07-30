import java.util.regex.Pattern.compile

fun main(){
    print("Input your email to validate: ")

    val inputEmail = readLine()
    val emailRegex = compile(
        "[a-zA-Z0-9\\\\+\\\\.\\\\_\\\\%\\\\-\\\\+]{1,256}"+
                "\\@"+
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\."+
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+"
    )

    val isMyEmailValid = emailRegex.matcher(inputEmail).matches()
    println("Email: $inputEmail is $isMyEmailValid")
}