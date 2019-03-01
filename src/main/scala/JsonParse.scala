import com.google.gson.{JsonElement, JsonObject, JsonParser}

import scala.io.Source

object JsonParse {

  def main(args: Array[String]): Unit = {

    val source:String = Source.fromFile("/Users/amaraj0/Desktop/test.json").getLines().mkString
    println(source)
    val jelement:JsonElement = new JsonParser().parse(source)
    val jobject:JsonObject = jelement.getAsJsonObject();
    val name = jobject.getAsJsonPrimitive("name")
    println(name)
    val id = jobject.getAsJsonPrimitive("id")
    println(id)
    val salary = jobject.getAsJsonPrimitive("salary")
    println(salary)
  }
}
