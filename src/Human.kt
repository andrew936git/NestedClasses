import javax.swing.text.StyledEditorKit.BoldAction

class Human(val name: String) {
    fun decide() {

    }

    class Head{
        companion object {
            fun decide(): Boolean {
                println("Сделайте выбор 1 - пойти гулять/ 2 - остаться дома")
                val num = readln().toInt()
                return if (num == 1) true
                else false
            }
        }
    }

    inner class Legs{
        fun walk(){
            if (Head.decide()) println("$name гуляет")
            else println("$name остался дома")
        }
    }
}