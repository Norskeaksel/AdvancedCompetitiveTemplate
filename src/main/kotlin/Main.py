def solve(a, b):
    return a + b


if __name__ == "__main__":
    try:
        testInput = open('Input.txt')
        output = open('Output.txt', 'w')
    except FileNotFoundError:
        output = None
    while True:
        try:
            a, b = [int(i) for i in testInput.readline().split()]
        except:
            a, b = [int(i) for i in input().split()]

        if a + b == 0:
            break

        if output is not None:
            output.write(str(solve(a, b)) + '\n')

        print(solve(a, b))
