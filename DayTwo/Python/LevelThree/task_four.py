number = int(input("Enter a number: " ))

result = 0

for count in range(1, 12):
    result = count * number
    print(f"{number} x {count} = {result}") 
