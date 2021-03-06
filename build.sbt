import PlayKeys._

name := "log-server"

version := "1.0"

resolvers += Resolver.url("Markus Jura fork swagger-play2", url("http://markusjura.github.com/swagger-play2"))(Resolver.ivyStylePatterns)

libraryDependencies ++= Seq(
  ws,
  "swagger-play2" %% "swagger-play2" % "1.3.5"
)

lazy val root = (project in file(".")).addPlugins(PlayScala)
