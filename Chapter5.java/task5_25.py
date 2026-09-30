number = int(input("Enter odd number between 1 to 19: "))

middle = (number + 1) // 2

for count in range(1, middle + 1):
    for space in range(0, middle - count):
        print(" ", end="")
    
    for star in range(0, 2*count - 1):
        print("*", end="")
    
    print()

for count in range(middle - 1, 0, -1):
    for space in range(0, middle - count):
        print(" ", end="")
    
    for star in range(0, 2*count - 1):
        print("*", end="")
    
    print()
