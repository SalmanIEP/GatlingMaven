package RCLoadTest.scenerios
import  RCLoadTest.requests.{GetRestCountries}
import io.gatling.core.Predef.scenario
object GetRestCountriesScenerio {

  val getrestcountryscenerio = scenario("Create User Scenario")
    .exec(GetRestCountries.getrestcountries)
}
