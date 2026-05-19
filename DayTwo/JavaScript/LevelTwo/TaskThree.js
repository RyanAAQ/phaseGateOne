const prompt = require("prompt-sync")();

let score = Number(prompt("Enter the score: "))

if(score >= 50){
    console.log("Pass");
}
else{
    console.log("Fail")
}
