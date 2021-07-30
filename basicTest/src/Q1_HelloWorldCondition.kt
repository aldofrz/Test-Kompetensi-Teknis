fun main() {
    print("Input any number (let's try you luck): ")

    val enteredInteger = readLine()
    val conclusion: String
    val int = Integer.parseInt(enteredInteger)

    conclusion = if((int % 5 == 0) && (int % 3 == 0)){
        "Hello World"
    }else if (int % 5 == 0){
        "World"
    }else if (int % 3 == 0){
        "Hello"
    }else{
        "You're not lucky"
    }

    println(conclusion)
}


