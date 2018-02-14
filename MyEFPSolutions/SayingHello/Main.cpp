/**
Ben Stone
"Saying Hello"
Problem Statement: Create program that prompts for user's name and prints a greeting using aformentioned name.
Inputs: User Name
Processes: Prompt for name, Record name, Construct greeting, Display greeting
Outputs: Greeting
Constraints: Don't write over variable in which the user's name is stored.
Tests: Input "Ben" -> Output "Hello, Ben, my name is Apollo. Great to meet you!"
*/
#define NAME_SIZE 256
#define GREETING_MESSAGE_SIZE 47

#include <iostream>
#include <cstring>

int main()
{
	// Prompt for name
	std::cout << "What is your name?" << std::endl;
	
	// Record name
	char userName[NAME_SIZE];
	std::cin.getline(userName, NAME_SIZE);

	// Construct Greeting
	char greeting[NAME_SIZE + GREETING_MESSAGE_SIZE] = "Hello ,";
	strcat_s(greeting, userName);
	strcat_s(greeting, ", my name is Appolo. Great to meet you!");

	// Display greeting
	std::cout << greeting;
	
	std::cin.get();
}