pi = 0

for i in range(1, 200001):
    denominator = i * 2 - 1
    fraction = 4.0 / denominator
    
    if i % 2 == 1:
        pi = pi + fraction
    else:
        pi = pi - fraction

print("Pi is: " + str(pi))
