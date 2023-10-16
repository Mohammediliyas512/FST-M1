fruit_shop = {
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "peaches": 15
}

checks = input("What are you looking for? ").lower()

if checks in fruit_shop:
    print("Yes, this is available")
else:
    print("No, this is not available")