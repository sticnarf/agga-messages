name := "agga-messages"

organization := "me.sticnarf"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.4"

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)