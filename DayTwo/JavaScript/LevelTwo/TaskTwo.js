const prompt = require("prompt-sync")();

let number = Number(prompt("Enter a number: "))

if(number < 0){
    console.log("It is a negative number");
}
else{
    console.log("It is a positive number")
}
