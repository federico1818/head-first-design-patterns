package sim

class RedheadDuck: Duck() {
    override val flyBehavior: FlyBehavior = FlyWithWings()

    override fun display() {
        println("I'm a redhead duck")
    }
}