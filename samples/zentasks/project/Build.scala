import sbt._
import Keys._

import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "Tasks manager"
    val appVersion      = "0.1"

    val appDependencies = Nil

    val main = PlayProject(appName, appVersion, appDependencies).settings(defaultScalaSettings:_*)

}
            