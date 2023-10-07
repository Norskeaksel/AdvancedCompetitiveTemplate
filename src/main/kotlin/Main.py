def solve(a, b):
    return a + b


if __name__ == "__main__":
    while True:
        a, b = [int(i) for i in input().split()]
        if a + b == 0:
            break

        print(solve(a, b))
