for row in range(1, 11):
    
    for count in range(1, 11):
        if count <= row:
            print("*", end="")
        else:
            print(" ", end="")
    print("  ", end="")

    for count in range(10, 0, -1):
        if count >= row:
            print("*", end="")
        else:
            print(" ", end="")
    print("  ", end="")

    for count in range(1, 11):
        if count < row:
            print(" ", end="")
        else:
            print("*", end="")
    print("  ", end="")

    for count in range(10, 0, -1):
        if count <= row:
            print("*", end="")
        else:
            print(" ", end="")

    print()  
