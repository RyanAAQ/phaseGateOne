console.log(add(2, 2));
console.log(isEven(2));
console.log(square(3));
console.log(converter(100));
console.log(isPrime(3));
console.log(getLargest(10, 20, 30));
console.log(reverse(123));
console.log(area(20, 12))

function add(numberOne, numberTwo){
    return numberOne + numberTwo;
}

function isEven(number){
    if(number % 2 == 0){
        return true;
    }
    else{
        return false
    }
}

function square(number){
    return number * number;
}

function converter(celcius){
    return (9.0 / 5.0) * celcius + 32;
}

function isPrime(number){

    if(number <= 1){
        return false;
        }
    
    for(let count = 2; count <= number / 2; count++){
        if(number % count == 0){
            return false;
    }
        }
        return true;
    }

function getLargest(numberOne, numberTwo, numberThree){
    
    let largest = numberOne;
        
    if((numberTwo > numberOne) && (numberTwo > numberThree)){
        largest = numberTwo;
    }
    else if((numberThree > numberOne) && (numberThree > numberTwo)){
    largest = numberThree;
    }
        return largest;
    }
    
function simpleInterest(principal, rate, time){
    return (principal * rate * time) / 100;
}

function area(length, width){
    return length * width;
}

function reverse(number){
let reversed = 0;

while(number > 0){
    digit = number % 10
    reversed = reversed * 10 + digit;
    number /= 10;
    }
    return reversed; 
}

    
