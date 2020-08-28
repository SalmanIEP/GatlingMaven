package RCLoadTest.requests
import RCLoadTest.config.Config.app_url
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object GetRestCountries {
  //Request
  val getrestcountries = exec(http("Create Get Request to get list of countries")
    .get(app_url+"/eesti")
    .check(status is 200))
}
