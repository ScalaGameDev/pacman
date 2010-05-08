package epfl.pacman

import maze.controller._
import maze.model._
import maze.view._

object Main {
  val rnd = new scala.util.Random(System.currentTimeMillis)

  def main(args: Array[String]): Unit = {
    var model = new Model()
    val view = new View(model)
    val controller = new Controller(view)
    val ticker = new Ticker(controller)
    controller.start()
    ticker.start()

    new interface.PacmanApp(view).main(args)
  }

}
