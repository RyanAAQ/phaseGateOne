const prompt = require("prompt-sync")();

let numberOne = Number(prompt("Enter the first number: "))
let numberTwo = Number(prompt("Enter the second number: "))
let numberThree = Number(prompt("Enter the second number: "))

let largest = numberOne;

    if(numberTwo > largest){
        largest = numberTwo;    
    }
    else if((numberThree > largest) && (numberThree > numberTwo)){
        largest = numberThree;
    }
    
    console.log(`The largest number = ${largest}`);

