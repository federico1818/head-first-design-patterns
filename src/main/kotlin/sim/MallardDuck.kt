package sim

class MallardDuck: Duck() {
    override val flyBehavior: FlyWithWings = FlyWithWings()

    override fun display() {
        println("I'm a mallard duck")
    }
}