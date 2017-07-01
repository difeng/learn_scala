package chapter7

/**
  * Created by duyongfeng@creditzx.com on 2017/6/30.
  */
object Exercise_9 extends App {
  import java.lang.System
  val sysPros = System.getProperties
  val pwd = Console.readLine()
  if (pwd.equals("secret")) {
    println("hello " + sysPros.getProperty("user.name"))
  } else
    println("密码错误！")
}
