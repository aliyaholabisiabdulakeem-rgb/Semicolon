count = int(input("How many numbers? "))

number = int(input("Enter number: "))
minimum = number
maximum = number
total = number
index = 1

while index < count:
    number = int(input("Enter number: "))
    if number < minimum:
        minimum = number
    if number > maximum:
        maximum = number
    total += number
    index += 1

print("Minimum is " , minimum)
print("Maximum is " , maximum)
print("Sum is " , total)
