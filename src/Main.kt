fun main() {
//1
    val human = Human("Иван")
    human.Legs().walk()
    println("------------------------------")
//2
    val stringArray = arrayOf("Иванов", "Петров", "Сидоров", "Процветов", "Протасов")
    println("Введите символ:")
    val symbol = readln().lowercase()
    var buf = 0
    for (i in stringArray.indices){
        if (stringArray[i].contains(symbol, true)) {
            print("${stringArray[i]} ")
            buf++
        }
        else continue
    }
    if(buf == 0) println("Совпадений нет")
    println("\n--------------------------------------")
//3
    val array = arrayOf(1, 0 ,7, 6, 4, 9, 0, 2, 3, 9, 5)
    var count = 0
    var j = 0
    while (j < array.size-1){
        if (array[j] == 0){
            j++
            while (array[j] != 0){
                count++
                j++
            }
        }
        j++
    }
    println(count)
}
