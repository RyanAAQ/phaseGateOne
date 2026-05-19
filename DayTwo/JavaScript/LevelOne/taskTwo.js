const prompt = require("prompt-sync")();

let age = Number(prompt("How old are you: "));

let newAge = age + 5;

console.log(`You will be ${newAge} years old in 5 years`);
