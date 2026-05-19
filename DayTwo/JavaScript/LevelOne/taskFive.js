const prompt = require("prompt-sync")();

let celcius = Number(prompt("Enter the temperature in celcius: "));

fahrenheit = (9.0 / 5.0) * celcius + 32;

console.log(`${celcius}C = ${fahrenheit}F`)
