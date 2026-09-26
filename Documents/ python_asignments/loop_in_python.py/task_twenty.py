number = "28082010"
smallest_number = 0

for i in number:
    if int(i) < smallest_number:
        smallest_number = int(i)

print("Smallest digit = " , smallest_number)
