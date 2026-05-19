import random

number = random.randint(1, 100)

counter = 0

while counter < 5:

    guess = int(input("Guess a number between 1-100: "))
    counter += 1
    
    if(guess == number):

        if(counter == 1):
            print("Your rating is LEGENDARY");
    
        elif(counter == 2):
            print("Your rating is EXCELLENT");
        
        elif(counter == 3):
            print("Your rating is GOOD");
        
        elif(counter == 4):
            print("Your rating is GOOD");
       
        elif(counter == 5):
            print("Your rating is CLOSE");
    
    if(guess < 1) or (guess > 100):
        print("Invalid number")
        counter = 0
        continue
        
    if(guess == number):
        print("YOU WIN")
        break

    if(guess < number):
        print("Higher")
        
    elif(guess > number):
        print("Lower")
        
print(f"\nThe correct number is {number}")
print(f"\nThe amount of attempts is {counter}")

        
        
        
      
    


