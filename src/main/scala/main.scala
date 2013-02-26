import spray.json._

object Test extends App {
val source = """{"some":"JSON source" }"""
val jsonAst = source.asJson

println(jsonAst.prettyPrint)

}
