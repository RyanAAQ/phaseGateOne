const prompt = require("prompt-sync")();

let result = 0;
        
for(let count = 1; count <= 5; count++){
        
number = Number(prompt("Enter a number: "));
            
    result += number;
}
console.log("The sum of the 5 numbers = " + result);
