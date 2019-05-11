package testData.timeoutTest

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import org.spekframework.spek2.style.specification.describe

object DefaultTimeoutTest: Spek({
    test("should timeout") {
        sleep(10100)
    }

    describe("timeout specification style") {
        it("should timeout") {
            sleep(10100)
        }
    }

    Feature("timeout gherkin style") {
        Scenario("some scenario") {
            Then("should timeout") {
                sleep(10100)
            }
        }
    }
})
