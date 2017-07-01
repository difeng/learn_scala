package chapter6

/**
  * Created by duyongfeng@creditzx.com on 2017/6/27.
  */
class Account {
  val id = Account.newUniqueNumber()
  private var balance = 0.0
  def deposit(amount: Double) {balance += amount}
}

object Account {
  private var lastNumber = 0
  private def newUniqueNumber() = {lastNumber += 1; lastNumber}

  def main(args: Array[String]): Unit = {
    Account.newUniqueNumber()
  }
}
