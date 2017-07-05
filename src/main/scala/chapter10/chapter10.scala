package chapter10

/**
  * Created by difeng on 2017/7/4.
  */
object chapter10 {
  /**
    类可以实现任意数量的特质
    特质可以要求实现它们的类具备特定的字段、方法或超类
    和Java接口不同，Scala特质可以提供方法和字段的实现
    当你将多个特质叠加在一起时，顺序很重要——其方法先被执行的特质排在更后面
    **/
  //当做接口使用的特质
  trait Logger {
    def log(msg: String)
  }

  class ConsoleLogger extends Logger {
    def log(msg: String) {println(msg)}
  }
  //带有具体实现的特质
  //带有特质的对象
  //叠加在一起的特质
  //在特质中重写抽象方法
  //特质中的具体字段
  //特质中的抽象字段
  //特质构造顺序
}
