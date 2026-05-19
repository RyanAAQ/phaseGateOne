const prompt = require("prompt-sync")();

const number = Math.floor(Math.random() * 100) + 1; 

let guess = 0;
let attempts = 0;
let rating = "BETTER LUCK";

while (attempts < 5) {
    guess = Number(prompt("Enter your guess: "));
    attempts += 1;

    if ((guess < 1) || (guess > 100)) {
        console.log("Invalid number, Choose between 1-100 ");
        attempts = 0;
        continue;
    }

    if (guess == number) {
        console.log("You are correct!!");
        break;
    } else if (guess < number) {
        console.log("Higher!");
    } else {
        console.log("Lower!");
    }

    if (attempts == 1) {
        rating = "LEGENDARY";
    } else if (attempts == 2) {
        rating = "EXCELLENT";
    } else if (attempts == 3) {
        rating = "GOOD";
    } else if (attempts == 4) {
        rating = "GOOD";
    } else if (attempts == 5) {
        rating = "CLOSE";
    }
} 
console.log("The correct number is " + number);
console.log("Your rating is " + rating);
console.log("Number of attempts are " + attempts);

