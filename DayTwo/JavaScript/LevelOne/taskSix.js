const prompt = require("prompt-sync")();

let length = Number(prompt("Enter the first number: "));
let width = Number(prompt("Enter the second number: "));

let area = length * width;

console.log(`The area = ${area}`);
