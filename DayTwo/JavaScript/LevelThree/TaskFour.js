const prompt = require("prompt-sync")();

let number = Number(prompt("Enter a number: "))

let result = 0;

    for(let count = 1; count <= 12; count++){
        result = count * number;
            console.log(number +  " x " + count + " = " + result);
            
     }
