for count in range(1, 10):
    n = count
    if count > 5:
        n = 10 - count
    
    for space in range(1, 6 - n):
        print(" ", end="")
    
    for star in range(1, 2*n):
        print("*", end="")
    
    print()
