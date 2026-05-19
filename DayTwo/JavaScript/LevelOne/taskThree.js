const prompt = require("prompt-sync")();

let numberOne = Number(prompt("Enter the first number: "));
let numberTwo = Number(prompt("Enter the second number: "));

let sum = numberOne + numberTwo;

console.log(`The sum = ${sum}`);
