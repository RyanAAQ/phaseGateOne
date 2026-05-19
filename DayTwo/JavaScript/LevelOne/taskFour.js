const prompt = require("prompt-sync")();

let numberOne = Number(prompt("Enter the first number: "));
let numberTwo = Number(prompt("Enter the second number: "));

let product = numberOne * numberTwo;

console.log(`The Product = ${product}`);
