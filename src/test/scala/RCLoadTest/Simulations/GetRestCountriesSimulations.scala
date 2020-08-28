package RCLoadTest.Simulations
import  RCLoadTest.config.Config
import RCLoadTest.requests.GetRestCountries
import RCLoadTest.scenerios.GetRestCountriesScenerio
import io.gatling.core.Predef.Simulation
import io.gatling.core.Predef._

class GetRestCountriesSimulations extends Simulation{

   val GetRestCountries = GetRestCountriesScenerio.getrestcountryscenerio
     .inject(atOnceUsers(5))
  setUp(GetRestCountries)

}
