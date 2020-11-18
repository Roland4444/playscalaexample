lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """play-scala-forms-example""",
    version := "2.8.x",
    scalaVersion := "2.13.1",
    resolvers += "Local Maven Repository" at "file://home/romanx/.m2/repository",
    libraryDependencies += "org.example" % "sbtdependency" % "1.0",
    libraryDependencies += "fr.roland" % "Executor" % "1.0.1",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
    ),
    libraryDependencies ++= Seq(
      jdbc
    ),
    libraryDependencies ++= Seq(
      jdbc,
      "org.playframework.anorm" %% "anorm" % "2.6.4"
    ),


      scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )
////