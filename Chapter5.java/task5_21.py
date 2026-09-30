print("Side1 \t Side2 \t Hypotenuse")

for Side1 in range(1, 501):
    for Side2 in range(1, 501):
        for Hypotenuse in range(1, 501):
            if Side1 * Side1 + Side2 * Side2 == Hypotenuse * Hypotenuse:
                print(Side1, "\t", Side2, "\t", Hypotenuse)
