package chapter8

import Exercise_1.BankAccount
/**
  * Created by difeng on 2017/7/1.
  *
  */
object Exercise_2 {

  class SavingsAccount(initialBanlance: Double) extends BankAccount(initialBanlance: Double) {
    var rate = 0.0042
    var feeCount = 0
    private var balance = initialBanlance
    def earnMonthlyInterest(): Unit = {
      balance = balance * (1 + rate)
      feeCount = 0
    }
    override def deposit(amount: Double) = {balance += amount;fee();balance}
    override def withdraw(amount: Double) = {balance -= amount;fee();balance}
    def fee() = {feeCount += 1; balance -= 1}

    def curBalance() = balance
  }

  def main(args: Array[String]): Unit = {
    val sA = new SavingsAccount(100)
    sA.deposit(10)
    println(sA.curBalance)
    sA.deposit(10)
    println(sA.curBalance)
    sA.deposit(10)
    println(sA.curBalance)
    sA.withdraw(10)
    sA.earnMonthlyInterest()
    println(sA.curBalance)
  }
}
