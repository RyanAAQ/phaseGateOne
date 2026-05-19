number_one = int(input("Enter the first number: "))
number_two = int(input("Enter the second number: "))
number_three = int(input("Enter the third number: "))

largest = number_one

if(number_two > largest):
    largest = number_two
    
elif((number_three > number_two) and (number_three > largest)):
    largest = number_three

print(f"The largest number = {largest}")
