const prompt = require("prompt-sync")();

    let result = 0;
    
    let number = 1;
    
while(number != 0){
        
number = Number(prompt("Enter a number: "));
    
    result += number;
}
    console.log("The sum = " + result);
