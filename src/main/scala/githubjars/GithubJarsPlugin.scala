package githubjars

import sbt._

trait GithubJarsPlugin extends Project with ManagedProject {
  
  def github(user : String, repo : String, jarName : String, version : String) : ModuleID = {
    (user + "." + repo) % jarName % version from "http://github.com/downloads/" + user + "/" + repo + "/" + jarName + "-" + version + ".jar"
  }
}