const prompt = require("prompt-sync")();

let price = Number(prompt("Enter the price of the item: "));

let tax = price * 0.10;
let newPrice = price + tax

console.log(`The new price = ${newPrice}`);
