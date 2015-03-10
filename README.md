# Spark, Spark Streaming and Spark SQL unit testing strategies

[![Build Status](https://travis-ci.org/mkuthan/example-spark.svg?branch=master)](https://travis-ci.org/mkuthan/example-spark) [![Coverage Status](https://img.shields.io/coveralls/mkuthan/example-spark.svg)](https://coveralls.io/r/mkuthan/example-spark?branch=master)

Features
========

* [ClockWrapper](src/test/scala/org/apache/spark/streaming/ClockWrapper.scala) for efficient clock management in Spark Streaming jobs.
* Base traits for testing [Spark](src/test/scala/mkuthan/spark/SparkSpec.scala), [Spark Streaming](src/test/scala/mkuthan/spark/SparkStreamingSpec.scala) and [Spark SQL](src/test/scala/mkuthan/spark/SparkSqlSpec.scala) to eliminate boilerplate code.
* Sample applications to show how to make your code testable.
* All tests can be run or debugged directly from IDE, or using SBT.
* All test fixtures are prepared as in-memory data structures.
* SBT is configured to avoid problems with multiple Spark contexts in the same JVM [SPARK-2243](https://issues.apache.org/jira/browse/SPARK-2243).
* Logger is configured, uncomment specific loggers in [logback-test.xml](src/test/resources/logback-test.xml) if needed.

References
==========

[http://mkuthan.github.io/blog/2015/03/01/spark-unit-testing/](http://mkuthan.github.io/blog/2015/03/01/spark-unit-testing/)
[https://github.com/holdenk/spark-testing-base](https://github.com/holdenk/spark-testing-base)
