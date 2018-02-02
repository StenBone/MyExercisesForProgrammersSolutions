// Author: Ben Stone
// Date of Last Update: 29 Jan 2018
// Exercise Description: Create a console based program to calculate the tip for a transaction
// Challenge Description: Type check input
// Page(s) in Exercises for Programmers: 6-7

#include <iostream>
#include <math.h>

using namespace std;

int main()
{
	// VARIABLE INIT
	float billAmount = 0.0f;
	float tip = 0.0f;
	int tipRate = 0; // tip percentage expressed as an integer.
	float total = 0.0f;
	// END VI

	// PROMPT FOR USER INPUT
	cout << "What is the bill amount?" << endl;
	cin >> billAmount;

	cout << "What is the tip rate?" << endl;
	cin >> tipRate;
	// END PFUI

	// CALC TIP
	tip = billAmount * (tipRate * 0.01f);
	tip = ceilf(tip * 100) / 100; // want to round up to the .0X place.
								  // END CT

								  // CALC TOTAL
	total = billAmount + tip;
	// END CT

	// DISPLAY OUTPUT
	cout.setf(ios::fixed); // fixed floating point
	cout.precision(2); // 2 digits after decimal
	cout << "Tip: $" << tip << endl;
	cout << "Total: $" << total << endl;
	// END DO

	cin.get(); //Prevent terminal from closing until user input
}