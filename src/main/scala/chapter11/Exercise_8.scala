package chapter11

/**
  * Created by difeng on 2017/7/8.
  */
object Exercise_8 extends App {

  class Matrix(val m: Int,val n: Int) {

    private val arr = Array.ofDim[Double](m, n)

    def apply(row: Int, col: Int): Double = arr(row)(col)

    def update(row: Int,col: Int,value: Double) = {
      arr(row)(col) = value
    }

    def + (other: Matrix): Matrix = {
      require(m == other.m)
      require(n == other.n)
      val ret = new Matrix(m,n)
      for(i <- 0 until m;j <- 0 until n) {
        ret(i,j) = arr(i)(j) + other(i,j)
      }
      ret
    }

//    def * (other: Matrix): Matrix = {
//      val ret = new Matrix(m,other.n)
//      for(i <- 0 until m;j <- 0 until n) {
////        ret()
//      }
//      ret
//    }

    override def toString: String = arr.map(_.mkString("[","  ","]")).mkString("[\n","\n","]")
  }

  val mat1 = new Matrix(2,2)
  mat1(0,0) = 1
  val mat2 = new Matrix(2,2)
  mat2(0,0) = 2
//  val mat3 = mat1 + mat2
  println(mat1)


}
