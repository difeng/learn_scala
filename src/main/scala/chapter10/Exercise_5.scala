package chapter10

import java.beans.{PropertyChangeEvent, PropertyChangeListener, PropertyChangeSupport}
import java.awt.Point
/**
  * Created by difeng on 2017/7/5.
  *
  */
object Exercise_5 extends App {

  trait PropertyChange {
    /**
      * 重新实现
       */
  }

  val p = new Point(1,2) with PropertyChange

}
