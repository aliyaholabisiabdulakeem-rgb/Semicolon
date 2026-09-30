principal = 1000.0

for r in range(5, 11):  # 5% to 10%
    rate = r / 100
    print(f"\nRate is {rate}")
    print("Year \t Amount")
    for year in range(1, 11):
        amount = principal * (1.0 + rate) ** year
        print(year, "\t", round(amount,2))

