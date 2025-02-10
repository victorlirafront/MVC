package main

import "fmt"

func main() {

	var accountBalance float64 = 1000

	fmt.Println("Welcome go Go Bank")
	fmt.Println("What do you want to do ?")
	fmt.Println("1. Check the balance")
	fmt.Println("2. Deposit money")
	fmt.Println("3. Withdraw money")
	fmt.Println("4. Exit")

	var choice int
	fmt.Print("Your choice: ")
	fmt.Scan(&choice)

	// wantsCheckBalance := choice == 1

	if choice == 1 {
		fmt.Println("Your balance is", accountBalance)
	} else if choice == 2 {
		fmt.Print("Your deposit: ")
		var depositAmount float64
		fmt.Scan(&depositAmount)
		accountBalance += depositAmount
		fmt.Println("Balance updated! new amount: ", accountBalance)
	}

	fmt.Println("Your choice:", choice)
}
