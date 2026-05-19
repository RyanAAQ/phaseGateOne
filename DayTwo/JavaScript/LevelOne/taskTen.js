const prompt = require("prompt-sync")();

let numberOne = Number(prompt("Enter the first number: "));
let numberTwo = Number(prompt("Enter the second number: "));
let numberThree = Number(prompt("Enter the third number: "));

let average = (numberOne + numberTwo + numberThree) / 3;

console.log(`The average = ${average}`);
