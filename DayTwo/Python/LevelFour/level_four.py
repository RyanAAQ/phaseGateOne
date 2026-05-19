def add(number_one, number_two):
    return number_one + number_two
    
def isEven(number):
    if(number % 2 == 0):
        return True
        
    return False
    
def square(number):
    return number * number
    
def converter(celcius):
    return (9.0 / 5.0) * celcius + 32
    
def isPrime(number):
    if(number <= 1):
        return False
        
    for count in range(2, number):
        if(number % count == 0):
            return False
            
    return True
    
def getLargest(number_one, number_two, number_three):
    largest = number_one;
        
    if((number_two > number_one) and (number_two > number_three)):
        largest = number_two
   
    elif((number_three > number_one) and (number_three > number_two)):
        largest = number_three
    
    return largest
    
def simpleInterest(principal, rate, time):
    return (principal * rate * time) / 100
    
def reverse(number):
    return (number[::-1])

    
print(add(1, 2))
print(isPrime(3))
print(getLargest(10, 20, 30))
print(simpleInterest(1000, 0.10, 12))
print(reverse("123"))
print(converter(100))
print(isEven(2))
