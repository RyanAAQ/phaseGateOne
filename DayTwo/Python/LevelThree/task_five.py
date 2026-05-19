number = int(input("Enter a number: " ))

result = 1

for count in range(1, number):
    result *= count
    print(f"{number}!= {result}")
