const prompt = require("prompt-sync")();

let radius = Number(prompt("Enter the radius: "));

let circumference = 2 * (22 / 7) * radius;

console.log(`The circumference = ${circumference}`)
