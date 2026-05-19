const prompt = require("prompt-sync")();

let numberOne = Number(prompt("Enter the first number: "))
let numberTwo = Number(prompt("Enter the second number: "))

let largest = numberOne;

    if(numberTwo > largest){
       largest = numberTwo;    
    }
    console.log(`The largest number = ${largest}`);

