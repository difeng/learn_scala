package chapter6

/**
  * Created by duyongfeng@creditzx.com on 2017/6/27.
  */
abstract class UndoableAction(val description: String) {
  def undo(): Unit
  def redo(): Unit
}

object DoNothingAction extends UndoableAction("Doing nothing") {
  override def undo() {}
  override def redo() {}
}
