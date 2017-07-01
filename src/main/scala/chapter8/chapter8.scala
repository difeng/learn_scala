package chapter8

/**
  * Created by difeng on 2017/7/1.
  * extends、final关键字和Java中相同
  * 重写方法时必须使用override
  * 只有主构造器可以调用超类中的主构造器
  * 你可以重写字段
  */
object chapter8 {
  /**
  1.扩展类
    扩展类使用extends，final修饰的类不能被扩展，
     final修饰类中的方法和字段不能被扩展类重写

  2.重写方法使用override

  3.类型检查和转换
    使用isInstanceOf[Cl]方法来判断类型
    使用asInstanceOf[Cl]方法来转换类型
    获取类型使用classOf[Cl]

  4.受保护字段和方法
    protected的成员对于类所属的包而言，是不可见的
    protected[this]可以将访问权限限定在当前的对象

  5.超类的构造
    子类的辅助构造器最终都会调用主构造器。只有主构造器可以调用超类的构造器

  6.重写字段
    def只能重写另一个def
    val只能重写另一个val或者不带参数的def
    var只能重写另一个抽象的var

  7.匿名子类
    和java一样，可以通过包含带有定义或重写的代码块的方式创建一个匿名的子类

  8.抽象类
    用abstract修饰
    抽象方法可以不用abstract修饰，只要省去方法体

  9.抽象字段
    没有初始值的字段
    val 定义了抽象的getter
    var 定义了抽象的getter和setter

  10.构造顺序和提前定义

  **/

}
