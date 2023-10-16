num_tuple = (10, 20, 31, 43, 65, 78)
print("Given list is ", num_tuple)

# Print tuples number that are divisible by 5
print("Elements that are divisible by 5:")
for num in num_tuple:
    if num % 5 == 0:
        print(num)