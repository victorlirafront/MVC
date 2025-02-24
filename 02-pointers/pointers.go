package main

import "fmt"

func main() {
	age := 32 //regular variable

	agePointer := &age

	fmt.Println("Age:", agePointer)
	fmt.Println("Age:", *agePointer) //getting the value of the pointer

	// adultYears := getAdultYears(age)
	// fmt.Println(adultYears)
}

func getAdultYears(age *int) int {
	return *age - 18
}
