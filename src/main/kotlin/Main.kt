import sim.Duck
import sim.MallardDuck
import sim.RedheadDuck

fun main() {
    var daffy: Duck = MallardDuck()
    var redhead: Duck = RedheadDuck()

    daffy.display()
    redhead.display()
}