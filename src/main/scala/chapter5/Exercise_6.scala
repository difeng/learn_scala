package chapter5

/**
  * Created by difeng on 2017/6/30.
  * 在5.2节的Person类中提供一个主构造器，将年龄转为0
  */
object Exercise_6 {
  class Person(var age: Int) {
    age = if(age < 0) 0 else age
  }

}
