import org.scalatest._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import Challenges._

class ChallengesSpec extends AnyFreeSpec with Matchers {
  "calculateSum" - {
    "calculates the sum of a list of numbers" in {
      val inputNumbers = List(1, 2, 3, 4, 5, 6)
      val expectedSum = 21
      val resultSum = calculateSum(inputNumbers)
      resultSum shouldBe expectedSum
    }

  }

  "filterAndConvert" - {
    "filters names with less than four characters and converts them to uppercase" in {
      val inputNames = List("Ravi", "Akiko", "Satoshi", "Priya", "Juan", "Bola")
      val expectedOutput = List("RAVI", "JUAN", "BOLA")
      val result = filterAndConvert(inputNames)
      result shouldBe expectedOutput
    }

    "returns an empty list when there are no names with less than four characters" in {
      val inputNames = List("Michael", "Sophia", "William")
      val result = filterAndConvert(inputNames)
      result shouldBe empty
    }
  }
}
