function returnArray(numbers, target){

    for (let number = 0; number < numbers.length; number++){
        for (let next = number + 1; next < numbers.length; next++){
        
    if (numbers[number] + numbers[next] == target){
    return [numbers[number], numbers[next]];
        }
    }
}
    return [];
}


module.exports = { returnArray }
