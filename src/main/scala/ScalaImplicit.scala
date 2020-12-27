import org.apache.commons.io.FilenameUtils

object ScalaImplicit {

  /*
  There are 3 types of use of Implicit
  1. Implicitly type conversion : It converts the error producing assignment into intended type
  val x :String = "1"
  val y:Int = x
  String is not the sub type of Int , so error happens in line 2.
  To resolve the error the compiler will look for such a method in the scope
  which has implicit keyword and takes a String as argument and returns an Int .

  2. Implicitly parameter injection
  If we call a method and do not pass its parameter value, it will cause an error.
  If the parameter has any implicit keyword it will look for any val in the scope
  which have the same type of value. If not get it will cause error.

  3. Implicitly receiver conversion: To call any property by a receiver the property must be the
     member of that receiver's class/object.
   */
  def main(args: Array[String]): Unit = {

    /*val ext1 = FilenameUtils.getExtension("hdfs://path/to/file/foo_A_N_.dbf")
    println(ext1)*/
    //1.
    implicit def doubleToInt(d: Double) = d.toInt   //If we comment this line then we will get error on line no. 28
    val x: Int = 42.0

    //2.
    def y(implicit a:Int)=a
    implicit val z:Int =10
    println(y)

    //3.
    class Person1{
      val worksAt:String = "xyz"
    }

    class Person2{
      val designation:String = "developer"
    }

    val person1 = new Person1
    implicit def xz(a:Person1):Person2 = new Person2
    println(person1.designation)

  }

}
