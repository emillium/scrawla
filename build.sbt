lazy val akkaHttpVersion = "10.1.5"
lazy val akkaVersion    = "2.5.18"

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "com.emillium",
      scalaVersion    := "2.12.7"
    )),
    name := "scrawla",
    libraryDependencies ++= Seq(
      "com.typesafe.akka"   %% "akka-http"            % akkaHttpVersion,
      "com.typesafe.akka"   %% "akka-http-spray-json" % akkaHttpVersion,
      "com.typesafe.akka"   %% "akka-http-xml"        % akkaHttpVersion,
      "com.typesafe.akka"   %% "akka-stream"          % akkaVersion,
      "com.ning"            % "async-http-client"     % "+",
      "org.jsoup"           % "jsoup"                 % "+",

      "com.typesafe.akka" %% "akka-http-testkit"    % akkaHttpVersion % Test,
      "com.typesafe.akka" %% "akka-testkit"         % akkaVersion     % Test,
      "com.typesafe.akka" %% "akka-stream-testkit"  % akkaVersion     % Test,
      "org.scalatest"     %% "scalatest"            % "3.0.5"         % Test
    ),
    resolvers ++= Seq(
      "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/",
      "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"
    )
  )
