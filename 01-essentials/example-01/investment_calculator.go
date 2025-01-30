package main

import (
	"fmt"
	"math"
)

func main() {
	const inflationRate = 2.5
	var investmentAmount float64
	var expectedReturnRate float64
	var years float64

	fmt.Print("Investment Amount: ")
	fmt.Scan(&investmentAmount)

	fmt.Print("Expected Return Rate: ")
	fmt.Scan(&expectedReturnRate)

	fmt.Print("Investment Years: ")
	fmt.Scan(&years)

	futureValue := investmentAmount * math.Pow(1+expectedReturnRate/100, years)
	futureRealValue := futureValue / math.Pow(1+inflationRate/100, years)

	//outputs information

	//fmt.Println("Future Value:", futureValue)

	fmt.Printf("Future Value: %v\nFuture Value (adjusted for inflation): %v", futureValue, futureRealValue)
	// fmt.Println("Future Value (adjusted for inflation):", futureRealValue)
}
