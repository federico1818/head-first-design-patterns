package sim

class ModelDuck: Duck() {
    override val flyBehavior: FlyBehavior = FlyNoWay()

    override fun display() {
        println("I'm a model duck")
    }
}