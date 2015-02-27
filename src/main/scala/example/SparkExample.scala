package example

import java.nio.file.Files

import org.apache.spark._
import org.apache.spark.SparkContext._


object SparkExample {

  private val master = "local[2]"
  private val appName = "example-spark"
  private val stopWords = Set("a", "an", "the")

  def main(args: Array[String]) = {

    val conf = new SparkConf()
      .setMaster(master)
      .setAppName(appName)

    val sc = new SparkContext(conf)

    val lines = sc.textFile("src/main/resources/data")
    val counts = WordCount.count(lines, stopWords)

    println(counts.collect().mkString("[", ", ", "]"))
  }
}