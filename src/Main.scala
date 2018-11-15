object Main extends App {
  val list = 1 to 100000
  list.par.map(_+41)

  val firstName = List("Sean","David","Louis","James")
  val firstName2 = firstName.par

    firstName.map(_.toUpperCase).foreach(println)
    firstName2.map(_.toUpperCase).foreach(println)

}
