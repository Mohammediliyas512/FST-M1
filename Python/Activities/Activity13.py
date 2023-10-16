def calculate_sum(numbers):
    sum1 = 0
    for number in numbers:
        sum1 += number
    return sum1

# Define the list of numbers
numList = [10, -40, -60, -90]

# Call the sum() function with numList as argument
result = calculate_sum(numList)

# Print result with message
print("The sum of all the elements is: " + str(result))