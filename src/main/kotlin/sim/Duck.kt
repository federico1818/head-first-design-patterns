package sim

open abstract class Duck {
    protected abstract val flyBehavior: FlyBehavior
    public abstract fun display()

    public fun quack() {
        println("Quack!!")
    }

    public fun swim() {
        println("I'm swimming")
    }

    public fun performFly() {
        this.flyBehavior.fly()
    }
}
