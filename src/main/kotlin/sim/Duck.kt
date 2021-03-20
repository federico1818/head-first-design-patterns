package sim

open abstract class Duck {

    public fun quack() {
        println("Quack!!")
    }

    public fun swim() {
        println("I'm swimming")
    }

    abstract fun display()
}