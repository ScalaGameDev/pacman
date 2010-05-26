package epfl.pacman

object Settings {
  // width of the text field (in pixels)
  val codeTextWidth = 350

  // size of the maze (number of blocks)
  // only used for computing the size of the game component.
  // painting actually only looks at the model, draws all walls and monsters
  val vBlocks = 20
  val hBlocks = 30

  // size in number of pixels of one block in the maze
  val blockSize  = 30

  // distance in number of pixels that make pacman be eaten
  val overlapThreshold = 10

  // miliseconds of sleep between one pixel move of a figure
  val sleepTime = 15

  // time to survive for completing in simple mode
  val surviveTime = ticks(30)

  // nb of lives available in advanced mode
  val nbLives = 3

  // time between getting eaten and re-starting the game
  val dieTime = ticks(3)

  // number of half ticks (fast pacman's ticks) for the hunter mode to last
  val ticksToHunt = 16

  // number of major ticks until monster revives
  val ticksToRevive = 20

  // percent of points that are super points
  val superPointsRatio = 4

  // keywords to highlight in the code editor
  val keywords = List("siChasseur", "siChassé", "siMonstresLoin", "siMonstresPrès",
                      "Droite", "Gauche", "Haut", "Bas",
                      "directionVersLesMonstres", "directionLoinDesMonstres",
                      "sinon")

    /** Convert seconds to ticks */
    private def ticks(s: Int) = s * 1000 / sleepTime
}
