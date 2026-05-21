def returnArray(numbers, target):
    numbers = list(numbers)
    
    for number in range(len(numbers)):
        for next in range(number + 1, len(numbers)):
            if numbers[number] + numbers[next] == target:
                return [numbers[number], numbers[next]]
                
    return []


