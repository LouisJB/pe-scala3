val scala3Version = "3.5.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "pe",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
    scalacOptions := Seq("-unchecked", "-deprecation"),
    
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
