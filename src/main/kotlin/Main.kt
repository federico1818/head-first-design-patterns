import sim.Duck
import sim.MallardDuck
import sim.ModelDuck
import sim.RedheadDuck

fun main() {
    val daffy: Duck = MallardDuck()
    val redhead: Duck = RedheadDuck()
    val model: Duck = ModelDuck()

    daffy.display()
    daffy.performFly()

    redhead.display()
    redhead.performFly()

    model.display()
    model.performFly()
}