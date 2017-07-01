package chapter8

import java.time.temporal.TemporalAmount

/**
  * Created by difeng on 2017/7/1.
  * 扩展如下BankAccount类，新类CheckingAccount对每次存款和取款都收取1美元手续费
  *
  * class BankAccount(initialBanlance: Double) {
    private var balance = initialBanlance
    def deposit(amount: Double) = {balance += amount;balance}
    def withdraw(amount: Double) = {balance -= amount;balance}
  }
  */
object Exercise_1 {

  class BankAccount(initialBanlance: Double) {
    private var balance = initialBanlance
    def deposit(amount: Double) = {balance += amount;balance}
    def withdraw(amount: Double) = {balance -= amount;balance}
  }

  class CheckingAccount(initialBanlance: Double) extends BankAccount(initialBanlance: Double) {
    private var balance = initialBanlance
    override def deposit(amount: Double) = {balance += amount;fee();balance}
    override def withdraw(amount: Double) = {balance -= amount;fee();balance}
    def fee() = {balance -= 1}
  }
}
